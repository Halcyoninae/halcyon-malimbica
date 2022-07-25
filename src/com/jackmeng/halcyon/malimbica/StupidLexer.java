package com.jackmeng.halcyon.malimbica;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Lexer {
  private Map<String, byte[]> content;
  public static final char LEXER_FORMAT = '1';

  public interface LexerDictionary {
    final String TAG_CHAR = "__";
    final String END_TAG_CHAR = "!_";
  }

  public static class StupidToken {
    private byte[] container;
    private StupidMethod armor;
    
    public enum StupidMethod {
      NUMERICAL,CHARABLE,BIN,ENC_SHA_256,ENC_SHIFT_64;
    }

    public StupidToken(StupidMethod method, byte ... container) {
      this.container = container;
      this.armor = method;
    }

    public Object[] armor(StupidMethod armor_override) {
      if(armor_override != null) {
        System.out.println("> STUPID_LEXER: Overriding the armor.\n\t-Overridden by third-party means");
      }
      if(armor_override == StupidMethod.CHARABLE) {
        List<Character> char_table = new ArrayList<>();
        StringBuilder bd = new StringBuilder();
        for(byte b : container) {
          bd.append(b);
        }
      }

    }
    
  }

  public Lexer(String objects) throws LexingException {
    content = init(objects);
  }

  private void identify(String obj) throws LexingException {
    if(obj.charAt(0) != LEXER_FORMAT) {
      throw new LexingException("Incorrect format spotted for this lexer!!\nGot: " + obj.charAt(0) +"\nMine: " + LEXER_FORMAT);
    }
  }

  private boolean is_tag(String obj) {
    return obj.endsWith(LexerDictionary.TAG_CHAR) && (obj.startsWith(LexerDictionary.TAG_CHAR) || obj.startsWith(LexerDictionary.END_TAG_CHAR));
  }

  private boolean String tag(String un) {
    if(is_tag(un)) {
      return 
    } 
    throw new LexingException("Tag: " + un + "\nIs not a tag!");
  }

  private Map<String, byte[]> init(String obj) throws LexingException {
    identify(obj);
    StringTokenizer st = new StringTokenizer(obj.substring(2, obj.length()));
    Map<String, byte[]> args = new HashMap<>();

    while(st.hasMoreTokens()) {
      String curr = st.nextToken();
      if(is_tag(curr)) {
        
      }
    }
    return null;
  }
}
