package com.company;

import gen.ToorlaListener;
import gen.ToorlaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;
import java.util.Objects;

public class Compiler implements ToorlaListener {
    public static int tabCount = 1;
    public static String tab = "    ";
    public static Boolean isEntry = false;
    public static int nested = 0;

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }
    public static String repeat(int count){
        return repeat(count, tab);
    }

    private static Void enterNestedStatement(){
        if (nested > 0) {
            System.out.println(repeat(tabCount) + "nested {");
            tabCount++;
        }
        nested++;
        return null;
    }
    public static Void exitNestedStatement(){
        nested--;
        if (nested > 0) {
            tabCount--;
            System.out.println(repeat(tabCount) + "}");
        }
        return null;
    }
    @Override
    public void enterProgram(ToorlaParser.ProgramContext ctx){
        System.out.println("Program start {");
    }

    @Override
    public void exitProgram(ToorlaParser.ProgramContext ctx){
        System.out.println("}");
    }

    @Override
    public void enterClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        String isEntryText = "isEntry: " + isEntry + " {";
        String classParent  = ctx.classParent != null ? " / class parent: " + ctx.classParent.getText() : " / class parent: none";
        System.out.println(repeat(tabCount)+"class: " + ctx.className.getText() + classParent + " / " + isEntryText);
        tabCount++;
    }

    @Override
    public void exitClassDeclaration(ToorlaParser.ClassDeclarationContext ctx) {
        System.out.println(repeat(tabCount - 1)+'}');
        tabCount--;
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
        System.out.println(repeat(tabCount)+"field: " + ctx.fieldName.getText() + " / " + "type: " + fieldType);
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
        String methodType = "class method: " + ctx.methodName.getText() ;
        String returnType = "return type: " + ctx.t.getText();
        RuleContext methodParent = ctx.parent;
        if(methodParent instanceof ToorlaParser.ClassDeclarationContext && Objects.equals(((ToorlaParser.ClassDeclarationContext) methodParent).className.getText(), ctx.methodName.getText())){
            methodType = "class constructor: " + ctx.methodName.getText() ;
        }
        if(isEntry){
            methodType = "main method: ";
            returnType = "type: " + ctx.t.getText();
        }
        String accessModifier = ctx.access_modifier() != null ? "/ type: " + ctx.access_modifier().getText() : "";
        System.out.println(repeat(tabCount)+ methodType + " / " + returnType + accessModifier + " {");
        tabCount++;
        String param1 = ctx.typeP1 != null ? "type: " + ctx.typeP1.getText() + " / name: " + ctx.param1.getText(): "";
        String param2 = ctx.typeP2 != null ? ", type: " + ctx.typeP2.getText() + " / name: " + ctx.param2.getText(): "";
        if(!isEntry){
        System.out.println(repeat(tabCount)+"parameter list: [" + param1 + param2 + "]");}
//        System.out.println(repeat(tabcount)+"=>>"+getParameters(ctx));
    }
    private String getParameters(ToorlaParser.MethodDeclarationContext ctx) {
        List<TerminalNode> parametersName = ctx.ID().subList(1, ctx.ID().size());
        List<ToorlaParser.ToorlaTypeContext> parametersType = ctx.toorlaType().subList(0, ctx.toorlaType().size() - 1);

        final int paramSize = parametersType.size();

        String params = "";
        for (int i = 0; i < paramSize; i++) {
            params += ("type: " + parametersType.get(i).getText() + " / name: " + parametersName.get(i).getText());
            if (i != (paramSize - 1))
                params += ", ";
        }
        return "parameter list: [" + params + "]";
    }

    @Override
    public void exitMethodDeclaration(ToorlaParser.MethodDeclarationContext ctx) {
        tabCount--;
        System.out.println(repeat(tabCount)+"}");
    }

    @Override
    public void enterClosedStatement(ToorlaParser.ClosedStatementContext ctx) {
//        System.out.println("**=>>>>>>" + ctx.getText());
    }

    @Override
    public void exitClosedStatement(ToorlaParser.ClosedStatementContext ctx) {

    }

    @Override
    public void enterClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
//        System.out.println("=>>>>**" + ctx.getText());
        System.out.println(repeat(tabCount) + "nested {");
        tabCount++;
//        enterNestedStatement();
    }

    @Override
    public void exitClosedConditional(ToorlaParser.ClosedConditionalContext ctx) {
        tabCount--;
        System.out.println(repeat(tabCount) + "}");
//        exitNestedStatement();
    }

    @Override
    public void enterOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
        //two possible nested calculations based on project in comment way comment enter statement code
//        System.out.println("=>>>>&&" + ctx.getText());
        System.out.println(repeat(tabCount)+"nested {");
        tabCount++;
//        enterNestedStatement();
    }

    @Override
    public void exitOpenConditional(ToorlaParser.OpenConditionalContext ctx) {
        tabCount--;
        System.out.println(repeat(tabCount)+ "}");
//        exitNestedStatement();
    }

    @Override
    public void enterOpenStatement(ToorlaParser.OpenStatementContext ctx) {
//        System.out.println("=>>>zoombaybaya");
    }

    @Override
    public void exitOpenStatement(ToorlaParser.OpenStatementContext ctx) {

    }

    @Override
    public void enterStatement(ToorlaParser.StatementContext ctx) {
//        System.out.println("**=>>>>>>" + ctx.getText());
        if(ctx.start != null && Objects.equals(ctx.start.getText(), "while")){
//            System.out.println("=>>" + ctx.start.getText());
            System.out.println(repeat(tabCount)+"nested {");
            tabCount++;
        }
    }

    @Override
    public void exitStatement(ToorlaParser.StatementContext ctx) {
        if(Objects.equals(ctx.start.getText(), "while")){
            tabCount--;
            System.out.println(repeat(tabCount) + "}");
        }
    }

    @Override
    public void enterStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {
        System.out.println(repeat(tabCount)+"field: " + ctx.i1.getText() + " / " + "type: local var");
    }

    @Override
    public void exitStatementVarDef(ToorlaParser.StatementVarDefContext ctx) {

    }

    @Override
    public void enterStatementBlock(ToorlaParser.StatementBlockContext ctx) {
//                System.out.println("**=>>>>>>" + ctx.getText());
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

    }

    @Override
    public void exitStatementReturn(ToorlaParser.StatementReturnContext ctx) {

    }

    @Override
    public void enterStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
//        enterNestedStatement();
    }

    @Override
    public void exitStatementClosedLoop(ToorlaParser.StatementClosedLoopContext ctx) {
//        exitNestedStatement();
    }

    @Override
    public void enterStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
//        System.out.println("nested{");
//        enterNestedStatement();
    }

    @Override
    public void exitStatementOpenLoop(ToorlaParser.StatementOpenLoopContext ctx) {
//        exitNestedStatement();
    }

    @Override
    public void enterStatementWrite(ToorlaParser.StatementWriteContext ctx) {

    }

    @Override
    public void exitStatementWrite(ToorlaParser.StatementWriteContext ctx) {

    }

    @Override
    public void enterStatementAssignment(ToorlaParser.StatementAssignmentContext ctx) {
//        System.out.println("=>>>>> "+ctx.get);
        if(ctx.right.e.a.e.c.a.m.u.m.o.i !=null){
        System.out.println(repeat(tabCount) + "field: " + ctx.left.getText() + " / type: " + ctx.right.e.a.e.c.a.m.u.m.o.i.getText());
        }
        //for other variables like self and print we can do this
//        else{
//            System.out.println(repeat(tabCount)+"field: " + ctx.start.getText() + " / " + "type: local var");
//        }
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
//        System.out.println("=>>>" + ctx.e.getText());
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
