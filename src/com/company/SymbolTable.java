package com.company;


import java.util.LinkedHashMap;

public class SymbolTable {
    private LinkedHashMap<String, ClassSymbolTable> classValues = new LinkedHashMap<>();

    public void insert(String key, ClassSymbolTable classSymbolTable) {
        classValues.put(key, classSymbolTable);
    }

    public LinkedHashMap<String, ClassSymbolTable> getClassValues() {
        return classValues;
    }

    public void printClassValues() {
        for (String key : classValues.keySet()) {
            System.out.println("Key: " + key + " Value: " + classValues.get(key).getName() + " " + classValues.get(key).getParent() + " " + classValues.get(key).getEntry());
        }
    }

    public ClassSymbolTable getClassSymbolTable(String key) {
        return classValues.get(key);
    }
}