package com.company;
import java.util.LinkedHashMap;

public class MethodSymbolTable {
    private String methodType;
    private String methodName;
    private String returnType;
    private String parameterList;
    private LinkedHashMap<String, NestedSymbolTable> nestedValues = new LinkedHashMap<>();
    private LinkedHashMap<String, FieldSymbolTable> fieldValues = new LinkedHashMap<>();

    public MethodSymbolTable(String methodType, String methodName, String returnType, String parameterList) {
        this.methodType = methodType;
        this.methodName = methodName;
        this.returnType = returnType;
        this.parameterList = parameterList;
    }

    public String getMethodType() {
        return methodType;
    }

    public String getMethodName() {
        return methodName;
    }

    public String getReturnType() {
        return returnType;
    }

    public String getParameterList() {
        return parameterList;
    }

    public LinkedHashMap<String, NestedSymbolTable> getNestedValues() {
        return nestedValues;
    }

    public LinkedHashMap<String, FieldSymbolTable> getFieldValues() {
        return fieldValues;
    }

}
