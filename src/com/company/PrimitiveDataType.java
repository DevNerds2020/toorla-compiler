package com.company;

public enum PrimitiveDataType {
    STRING("string"),
    INT("int"),
    BOOLEAN("boolean"),
    INT_ARRAY("int[]"),
    STRING_ARRAY("string[]");

    private String value;

    PrimitiveDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}