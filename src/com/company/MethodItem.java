package com.company;

public class MethodItem extends Item{
  private MethodItemType methodType;
  private String returnType;
  private String parameterList;

  public MethodItem(String name, MethodItemType methodType, String returnType, String parameterList) {
    super(name);
    this.methodType = methodType;
    this.returnType = returnType;
    this.parameterList = parameterList;
  }

  @Override
  public String toString() {
    return methodType + " (name: " + getName() + ") (return type: [" + returnType + "]) (parameter list: " + parameterList + ")";
  }
}

enum MethodItemType {
  METHOD,
  CONSTRUCTOR
}