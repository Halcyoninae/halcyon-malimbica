package com.jackmeng.halcyon.malimbica;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Malimbica {
  public static final String DEFAULT_PING_API = "https://halcyoninae.github.io/halcyon-malimbica/";
  public static String getAsString() {
    StringBuilder sb = new StringBuilder();
    try {
      URL url = new URL(DEFAULT_PING_API);
      InputStream is = url.openStream();
      BufferedReader br = new BufferedReader(new InputStreamReader(is));
      String temp = "";
      while((temp = br.readLine()) != null) {
        sb.append(temp);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return sb.toString();
  }
}