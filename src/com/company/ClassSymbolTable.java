package com.company;
import java.util.LinkedHashMap;

public class ClassSymbolTable {
    private String name;
    private String Parent;
    private Boolean isEntry;
    private LinkedHashMap<String, MethodSymbolTable> methodValues = new LinkedHashMap<>();
    private LinkedHashMap<String, FieldSymbolTable> fieldValues = new LinkedHashMap<>();

    public ClassSymbolTable(String name, String Parent, Boolean isEntry) {
        this.name = name;
        this.Parent = Parent;
        this.isEntry = isEntry;
    }

    public void insert(String symbolTableType, String key, MethodSymbolTable methodSymbolTable) {
        if (symbolTableType.equals("method")) {
            methodValues.put(key, methodSymbolTable);
        }
    }

    public String getName() {
        return name;
    }

    public String getParent() {
        return Parent;
    }

    public Boolean getEntry() {
        return isEntry;
    }

    public LinkedHashMap<String, MethodSymbolTable> getMethodValues() {
        return methodValues;
    }

    public LinkedHashMap<String, FieldSymbolTable> getFieldValues() {
        return fieldValues;
    }

    public void printMethodValues() {
        for (String key : methodValues.keySet()) {
            System.out.println("Key: " + key + " Value: " + methodValues.get(key).getMethodType() + " " + methodValues.get(key).getMethodName() + " " + methodValues.get(key).getReturnType() + " " + methodValues.get(key).getParameterList());
        }
    }

    public String toString() {
        return "------------- " + this.name + "scope number is declared in class" + " -------------" + 
         printItems() + "-------------------------------------\n";
    }

    public String printItems() {
        String result = "";
        for (String key : methodValues.keySet()) {
            result += "Key = " + key + " | Value: " + methodValues.get(key).getMethodType() + " " + methodValues.get(key).getMethodName() + " " + methodValues.get(key).getReturnType() + " " + methodValues.get(key).getParameterList();
        }
        return result;
    }
}
