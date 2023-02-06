package com.company;

public class ClassItem extends Item {
  private static final String type = "Class";
  private String parent;
  private Boolean isEntry;

  public ClassItem(String name, String parent, Boolean isEntry) {
    super(name);
    this.parent = parent;
    this.isEntry = isEntry;
  }
  
  @Override
  public String toString() {
    return type + " " + "(name: " + getName() + ") (parent: " + (parent != null ? parent : "[]") + ") (isEntry: " + isEntry + ")";
  }
}

