package com.jackmeng.halcyon.malimbica;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Lexer {
  private Map<String, String[]> content;
  public static final char LEXER_FORMAT = '1';
  public Lexer(String objects) {
    content = init(objects);
  }

  private void identify(String obj) throws LexingException {
    if(obj.charAt(0) != LEXER_FORMAT) {
      throw new LexingException("Incorrect format spotted for this lexer!!\nGot: " + obj.charAt(0) +"\nMine: " + LEXER_FORMAT);
    }
  }

  private Map<String, String[]> init(String obj) throws LexingException {
    identify(obj);
    StringTokenizer st = new StringTokenizer(obj);
      
  }
}
