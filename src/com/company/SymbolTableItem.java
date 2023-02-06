package com.company;

public abstract class SymbolTableItem {
  private String name;

  public SymbolTableItem(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
