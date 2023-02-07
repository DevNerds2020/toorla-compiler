package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;

public class SymbolTable {
  public static LinkedList<SymbolTable> tables = new LinkedList<>();
  public static SymbolTable root;

  public LinkedList<SymbolTable> children = new LinkedList<>();
  public SymbolTable parent;

  private final String name;
  private final int lineNumber;
  private LinkedHashMap<String, Item> table = new LinkedHashMap<>();
  
  public SymbolTable(String name, int line, SymbolTable parent) {
    this.name = name;
    this.lineNumber = line;
    this.parent = parent;
    tables.add(this);
  }

  public String getName() {
    return name;
  }

  public int getLineNumber() {
    return lineNumber;
  }

  public LinkedHashMap<String, Item> getTable() {
    return table;
  }

  public void insert(String key, Item symbol) {
    table.put(key, symbol);
  }

  public Item lookup(String key) {
    return table.getOrDefault(key, null);
  }

  public String toString() {
    return "-".repeat(9) + " " + this.name + ": " + this.lineNumber + " " + "-".repeat(9) + "\n" +
    printItems() + "\n" + "=".repeat(100);
  }

  private String printItems() {
    String result = "";
    for(var entry : table.entrySet()){
      String key = entry.getKey();
      String value = entry.getValue().toString();
      result += "Key : " + key + " | Value : " + value + "\n";
    }
    return result;
  }

  public boolean checkForDuplicates(String key, String className, int line, int column) {
    if (this.lookup(key) != null){
      System.out.println("Duplicate declaration of " + key + " in " + this.name + " at line " + line + " at column " + column);
      return true;
    }
    return false;
  }

  //check for class inheritance deadlock like a extends b b extends c c extends a
  //we have our classes in table 
  public void checkForInheritanceDeadLock(){
    //visited stack and toVisit stack
    LinkedList<String> visited = new LinkedList<>();
    LinkedList<String> toVisit = new LinkedList<>();
    for(var entry : table.entrySet()){
        String className = entry.getValue().getName();
        String parentName = ((ClassItem) entry.getValue()).getParent();
        //if parent is null we don't have to check for deadlock
        if(parentName != null){
            toVisit.add(parentName);
            while(!toVisit.isEmpty()){
                String current = toVisit.pop();
                if(current.equals(className))
                    //throw error with telling the class names
                    throw new RuntimeException("Inheritance deadlock detected in class " + className + " and " + current);
                if(!visited.contains(current)){
                    visited.add(current);
                    ClassItem targetClass = (ClassItem) table.get("Class_"+current);
                    if(targetClass != null){
                    String parent = ((ClassItem) table.get("Class_"+current)).getParent();
                    if(parent != null)
                        toVisit.add(parent);
                    }
                }
            }
        }
    }
  }
  
}
