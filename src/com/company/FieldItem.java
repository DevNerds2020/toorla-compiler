package com.company;

public class FieldItem extends Item{
  private FieldItemType fieldType;
  private String type;
  private boolean isDefined;

  public FieldItem(String name, FieldItemType fieldType, String type, boolean isDefined) {
    super(name);
    this.fieldType = fieldType;
    this.type = type;
    this.isDefined = isDefined;
  }

  @Override
  public String toString() {
    return fieldType + " " + "(name: " + getName() + ") (type: "  + type + ", isDefined: " + isDefined + ")"; 
  }
}
enum FieldItemType {
  CLASS_FIELD,
  PARAM_FIELD,
  METHOD_VAR
}
