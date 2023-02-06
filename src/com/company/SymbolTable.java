package com.company;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class SymbolTable {
  public static LinkedList<SymbolTable> tables = new LinkedList<>();
  public static SymbolTable root;

  public LinkedList<SymbolTable> children = new LinkedList<>();
  public SymbolTable parent;

  private final String name;
  private final int lineNumber;
  private LinkedHashMap<String, SymbolTableItem> table = new LinkedHashMap<>();
  
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

  public LinkedHashMap<String, SymbolTableItem> getTable() {
    return table;
  }

  public void insert(String key, SymbolTableItem symbol) {
    table.put(key, symbol);
  }

  public SymbolTableItem lookup(String key) {
    return table.getOrDefault(key, null);
  }
  
  public SymbolTableItem getSymbol(String key) {
    return table.get(key);
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
}
