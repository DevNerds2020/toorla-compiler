package com.company;
import java.util.LinkedHashMap;

public class FieldSymbolTable {
    private Boolean isDefined;
    private String name;
    private String fieldType;
    private String type;

    public FieldSymbolTable(String name, String fieldType, String type) {
        this.name = name;
        this.fieldType = fieldType;
        this.type = type;
        this.isDefined = false;
    }
}
