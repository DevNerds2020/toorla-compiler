package com.company;
import java.util.LinkedHashMap;

public class NestedSymbolTable {
    private String nestedName;
    private LinkedHashMap<String, FieldSymbolTable> values = new LinkedHashMap<>();
    public void insert(String key, FieldSymbolTable fieldSymbolTable) {
        values.put(key, fieldSymbolTable);
    }
}
