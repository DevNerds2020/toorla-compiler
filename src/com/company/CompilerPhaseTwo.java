package com.company;

import gen.ToorlaListener;
import gen.ToorlaParser;
import gen.ToorlaParser.ClassDeclarationContext;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class CompilerPhaseTwo implements ToorlaListener {
    private final Stack<SymbolTable> scopes = new Stack<>();

    public static Boolean isEntry = false;
    private boolean isReturnStatement = false;
    private boolean isMethodVar = false;
    private String returnType = null;
    private String methodVarType = null;

    @Override
    public void enterProgram(ToorlaParser.ProgramContext ctx){
        SymbolTable programSymbolTable = new SymbolTable("program", ctx.start.getLine(), null);
        scopes.push(programSymbolTable);
        SymbolTable.root = programSymbolTable;
    }

    @Override
    public void exitProgram(ToorlaParser.ProgramContext ctx){
        scopes.peek().checkForInheritanceDeadLock();
        scopes.pop();
    }

    @Override
    public void enterClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        int columnNumber = ctx.getStart().getCharPositionInLine();
        String classParent  = ctx.classParent != null ? ctx.classParent.getText() : "[]";
        String className = ctx.className.getText();
        String key = "Class_"+className;
        //check if the new class name is equal too last class names
        boolean isDuplicate = scopes.peek().checkForDuplicates(key, className, lineNumber, columnNumber);
        String finalClassName = isDuplicate ? className +"_" + lineNumber + "_" +columnNumber : className;
        //check for class inheritance dead lock
        scopes.peek().insert(key, new ClassItem(finalClassName, classParent, isEntry));
        SymbolTable classSymbolTable = new SymbolTable(finalClassName, lineNumber, scopes.peek());
        scopes.peek().children.add(classSymbolTable);
        scopes.push(classSymbolTable);

    }

    private String checkClassIsDefined(String className){
        return (SymbolTable.root.lookup("Class_"+className)==null) ? "False" : "True";
    }

    @Override
    public void exitClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
        isEntry = true;
    }

    @Override
    public void exitEntryClassDeclaration(ToorlaParser.EntryClassDeclarationContext ctx) {
        isEntry = false;
    }

    @Override
    public void enterFieldDeclaration(ToorlaParser.FieldDeclarationContext ctx) {
        String fieldType = ctx.fieldType.getText();
        String fieldName = ctx.fieldName.getText();
        boolean isDefined = true;
        for(PrimitiveDataType  value : PrimitiveDataType.values()){
            if(value.getValue().equals(fieldType)){
                isDefined = true;
                break;
            }
            isDefined = Boolean.parseBoolean(checkClassIsDefined(fieldType));
        }
        FieldItemType fieldItemType = FieldItemType.CLASS_FIELD;
        String key = "Field_"+fieldName;
        boolean isDuplicate = scopes.peek().checkForDuplicates(key, fieldName, ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine());
        String finalFieldName = isDuplicate ? fieldName + "_" + ctx.getStart().getLine() + "_" + ctx.getStart().getCharPositionInLine() : fieldName;
        scopes.peek().insert(key, new FieldItem(finalFieldName, fieldItemType, fieldType, isDefined));
    }

    @Override
    public void exitFieldDeclaration(ToorlaParser.FieldDeclarationContext ctx) {
    }

    @Override
    public void enterAccess_modifier(ToorlaParser.Access_modifierContext ctx) {
    }

    @Override
    public void exitAccess_modifier(ToorlaParser.Access_modifierContext ctx) {
    }

    @Override
    public void enterMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
        int lineNumber = ctx.getStart().getLine();
        int columnNumber = ctx.getStart().getCharPositionInLine();
        String methodName = ctx.methodName.getText();
        String returnType = ctx.t.getText();
        MethodItemType methodType = methodName.equals(((ClassDeclarationContext) ctx.parent).className.getText())
        ? MethodItemType.CONSTRUCTOR
        : MethodItemType.METHOD;        
        SymbolTable methodSymbolTable = new SymbolTable(methodName, lineNumber, scopes.peek());
        String parameterList = getParameters(ctx, methodSymbolTable);
        String key = methodType.toString().charAt(0)+methodType.toString().substring(1).toLowerCase()+"_"+methodName;
        boolean isDuplicate = scopes.peek().checkForDuplicates(key, methodName, lineNumber, columnNumber);
        String finalMethodName = isDuplicate ? methodName + "_" + lineNumber + "_" + columnNumber : methodName;
        scopes.peek().insert(key, new MethodItem(finalMethodName, methodType, returnType, parameterList));
        scopes.peek().children.add(methodSymbolTable);
        scopes.push(methodSymbolTable);
    }

    private String getParameters(ToorlaParser.MethodDeclarationContext ctx, SymbolTable methodSymbolTable) {
        List<TerminalNode> parametersName = ctx.ID().subList(1, ctx.ID().size());
        List<ToorlaParser.ToorlaTypeContext> parametersType = ctx.toorlaType().subList(0, ctx.toorlaType().size() - 1);

        final int paramSize = parametersType.size();

        String params = "";
        for (int i = 0; i < paramSize; i++) {
            String parameterName = parametersName.get(i).getText();
            String parameterType = parametersType.get(i).getText();
            boolean isDefined = true;
            for(PrimitiveDataType  value : PrimitiveDataType.values()){
                if(value.getValue().equals(parameterType)){
                    isDefined = true;
                    break;
                }
                isDefined = Boolean.parseBoolean(checkClassIsDefined(parameterType));
            }
            methodSymbolTable.insert("Field_"+parameterName, new FieldItem(parameterName, FieldItemType.PARAM_FIELD, parameterType, isDefined));
            params += ("[name: " + parametersName.get(i).getText() + ", type: " + parametersType.get(i).getText() + ", index: " + (i+1) + "]");
            if (i != (paramSize - 1))
                params += ", ";
        }
        return params.length()!=0 ? params : "[]";
    }

    @Override
    public void exitMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
        String methodReturnType = ctx.t.getText();
        if(methodReturnType!=null&&returnType!=null&&!methodReturnType.equals(returnType)){
            int lineNumber = ctx.start.getLine();
            int columnNumber = ctx.ID(0).getSymbol().getCharPositionInLine();
            methodReturnTypeError(methodReturnType, lineNumber, columnNumber);
        }
        returnType = null;
        scopes.pop();
    }
    
    private void methodReturnTypeError(String exceptedMethodReturnType, int line, int column){
        System.err.println("Error210 : in line " + line + ":" + column + ", ReturnType of this method must be " + exceptedMethodReturnType);
    }

    @Override
    public void enterClosedStatement(ToorlaParser.ClosedStatementContext ctx) {
    }

    @Override
    public void exitClosedStatement(ToorlaParser.ClosedStatementContext ctx) {
    }

    @Override
    public void enterClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
        SymbolTable ifSymbolTable = new SymbolTable("if", ctx.getStart().getLine(), scopes.peek());
        scopes.peek().children.add(ifSymbolTable);
        scopes.push(ifSymbolTable);
    }

    @Override
    public void exitClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
        SymbolTable nestedSymbolTable = new SymbolTable("nested", ctx.getStart().getLine(), scopes.peek());
        scopes.peek().children.add(nestedSymbolTable);
        scopes.push(nestedSymbolTable);
    }

    @Override
    public void exitOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterOpenStatement(ToorlaParser.OpenStatementContext ctx) {
    }

    @Override
    public void exitOpenStatement(ToorlaParser.OpenStatementContext ctx) {
    }

    @Override
    public void enterStatement(ToorlaParser.StatementContext ctx) {
    }

    @Override
    public void exitStatement(ToorlaParser.StatementContext ctx) {
    }

    @Override
    public void enterStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {
        isMethodVar = true;        
    }

    @Override
    public void exitStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {
        String fieldType = "[ localvar= ";
        String fieldName = ctx.i1.getText();
        boolean isDefined = true;
        // convert all PrimitiveDataType values to one string like "int,boolean,string"
        String allPrimitiveDataType = Arrays.stream(PrimitiveDataType.values()).map(PrimitiveDataType::getValue).collect(Collectors.joining(","));
        if(allPrimitiveDataType.contains(methodVarType)){
            isDefined = true;
            fieldType+=methodVarType;
        }else{
            fieldType+="classtype:["+methodVarType+"]";
            isDefined = Boolean.parseBoolean(checkClassIsDefined(methodVarType));
        }
        FieldItemType fieldItemType = FieldItemType.METHOD_VAR;
        String key = "Field_"+fieldName;
        scopes.peek().insert(key, new FieldItem(fieldName, fieldItemType, fieldType, isDefined));
        isMethodVar = false;
        methodVarType = null;
    }

    @Override
    public void enterStatementBlock(ToorlaParser.StatementBlockContext ctx) {
    }

    @Override
    public void exitStatementBlock(ToorlaParser.StatementBlockContext ctx) {
    }

    @Override
    public void enterStatementContinue(ToorlaParser.StatementContinueContext ctx) {
    }

    @Override
    public void exitStatementContinue(ToorlaParser.StatementContinueContext ctx) {
    }

    @Override
    public void enterStatementBreak(ToorlaParser.StatementBreakContext ctx) {
    }

    @Override
    public void exitStatementBreak(ToorlaParser.StatementBreakContext ctx) {
    }

    @Override
    public void enterStatementReturn(ToorlaParser.StatementReturnContext ctx) {
        isReturnStatement = true;
    }

    @Override
    public void exitStatementReturn(ToorlaParser.StatementReturnContext ctx) {
        isReturnStatement = false;
    }

    @Override
    public void enterStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
        String name = "while if for elif else".contains(scopes.peek().getName()) ? "nested" : "while";
        SymbolTable whileSymbolTable = new SymbolTable(name, ctx.getStart().getLine(), scopes.peek());
        scopes.peek().children.add(whileSymbolTable);
        scopes.push(whileSymbolTable);
    }

    @Override
    public void exitStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
        scopes.pop();
    }

    @Override
    public void enterStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
    }

    @Override
    public void exitStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
    }

    @Override
    public void enterStatementWrite(ToorlaParser.StatementWriteContext ctx) {
    }

    @Override
    public void exitStatementWrite(ToorlaParser.StatementWriteContext ctx) {
    }

    @Override
    public void enterStatementAssignment(ToorlaParser.StatementAssignmentContext ctx) {
    }

    @Override
    public void exitStatementAssignment(ToorlaParser.StatementAssignmentContext ctx) {
    }

    @Override
    public void enterStatementInc(ToorlaParser.StatementIncContext ctx) {
    }

    @Override
    public void exitStatementInc(ToorlaParser.StatementIncContext ctx) {
    }

    @Override
    public void enterStatementDec(ToorlaParser.StatementDecContext ctx) {
    }

    @Override
    public void exitStatementDec(ToorlaParser.StatementDecContext ctx) {
    }

    @Override
    public void enterExpression(ToorlaParser.ExpressionContext ctx) {
    }

    @Override
    public void exitExpression(ToorlaParser.ExpressionContext ctx) {
    }

    @Override
    public void enterExpressionOr(ToorlaParser.ExpressionOrContext ctx) {
    }

    @Override
    public void exitExpressionOr(ToorlaParser.ExpressionOrContext ctx) {
    }

    @Override
    public void enterExpressionOrTemp(ToorlaParser.ExpressionOrTempContext ctx) {
    }

    @Override
    public void exitExpressionOrTemp(ToorlaParser.ExpressionOrTempContext ctx) {
    }

    @Override
    public void enterExpressionAnd(ToorlaParser.ExpressionAndContext ctx) {
    }

    @Override
    public void exitExpressionAnd(ToorlaParser.ExpressionAndContext ctx) {
    }

    @Override
    public void enterExpressionAndTemp(ToorlaParser.ExpressionAndTempContext ctx) {
    }

    @Override
    public void exitExpressionAndTemp(ToorlaParser.ExpressionAndTempContext ctx) {
    }

    @Override
    public void enterExpressionEq(ToorlaParser.ExpressionEqContext ctx) {
    }

    @Override
    public void exitExpressionEq(ToorlaParser.ExpressionEqContext ctx) {
    }

    @Override
    public void enterExpressionEqTemp(ToorlaParser.ExpressionEqTempContext ctx) {
    }

    @Override
    public void exitExpressionEqTemp(ToorlaParser.ExpressionEqTempContext ctx) {
    }

    @Override
    public void enterExpressionCmp(ToorlaParser.ExpressionCmpContext ctx) {
    }

    @Override
    public void exitExpressionCmp(ToorlaParser.ExpressionCmpContext ctx) {
    }

    @Override
    public void enterExpressionCmpTemp(ToorlaParser.ExpressionCmpTempContext ctx) {
    }

    @Override
    public void exitExpressionCmpTemp(ToorlaParser.ExpressionCmpTempContext ctx) {
    }

    @Override
    public void enterExpressionAdd(ToorlaParser.ExpressionAddContext ctx) {
    }

    @Override
    public void exitExpressionAdd(ToorlaParser.ExpressionAddContext ctx) {
    }

    @Override
    public void enterExpressionAddTemp(ToorlaParser.ExpressionAddTempContext ctx) {
    }

    @Override
    public void exitExpressionAddTemp(ToorlaParser.ExpressionAddTempContext ctx) {
    }

    @Override
    public void enterExpressionMultMod(ToorlaParser.ExpressionMultModContext ctx) {
    }

    @Override
    public void exitExpressionMultMod(ToorlaParser.ExpressionMultModContext ctx) {
    }

    @Override
    public void enterExpressionMultModTemp(ToorlaParser.ExpressionMultModTempContext ctx) {
    }

    @Override
    public void exitExpressionMultModTemp(ToorlaParser.ExpressionMultModTempContext ctx) {
    }

    @Override
    public void enterExpressionUnary(ToorlaParser.ExpressionUnaryContext ctx) {
    }

    @Override
    public void exitExpressionUnary(ToorlaParser.ExpressionUnaryContext ctx) {
    }

    @Override
    public void enterExpressionMethods(ToorlaParser.ExpressionMethodsContext ctx) {
    }

    @Override
    public void exitExpressionMethods(ToorlaParser.ExpressionMethodsContext ctx) {
    }

    @Override
    public void enterExpressionMethodsTemp(ToorlaParser.ExpressionMethodsTempContext ctx) {
    }

    @Override
    public void exitExpressionMethodsTemp(ToorlaParser.ExpressionMethodsTempContext ctx) {
    }

    @Override
    public void enterExpressionOther(ToorlaParser.ExpressionOtherContext ctx) {
        String type = extractType(ctx);
        if(isReturnStatement && returnType == null){
            returnType = type;
        }else if(isMethodVar && methodVarType == null){
            if(type == null){
                type = "local var";
            }
            methodVarType = type;
        }
    }
    private String extractType(ToorlaParser.ExpressionOtherContext ctx) {
        if(ctx.n != null) {
            return "int";
        } else if(ctx.s != null) {
            return "string";
        } else if(ctx.st != null) {
            return ctx.st.getText() + "[]";
        } else if(ctx.i != null) {
            return ctx.i.getText();
        } else if(ctx.trueModifier != null || ctx.falseModifier != null) {
            return "boolean";
        }
        return null;
    }

    @Override
    public void exitExpressionOther(ToorlaParser.ExpressionOtherContext ctx) {
    }

    @Override
    public void enterToorlaType(ToorlaParser.ToorlaTypeContext ctx) {
    }

    @Override
    public void exitToorlaType(ToorlaParser.ToorlaTypeContext ctx) {
    }

    @Override
    public void enterSingleType(ToorlaParser.SingleTypeContext ctx) {
    }

    @Override
    public void exitSingleType(ToorlaParser.SingleTypeContext ctx) {
    }

    @Override
    public void visitTerminal(TerminalNode terminalNode) {
    }

    @Override
    public void visitErrorNode(ErrorNode errorNode) {
    }

    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {
    }

    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {
    }
}
