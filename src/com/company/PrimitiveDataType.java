package com.company;

public enum PrimitiveDataType {
    STRING("string"),
    INT("int"),
    INT_ARRAY("int[]");

    private String value;

    PrimitiveDataType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}