package com.jackmeng.halcyon.test;

import com.jackmeng.halcyon.malimbica.Lexer;
import com.jackmeng.halcyon.malimbica.Malimbica;

public class PingTest {
    public static void main(String[] args) throws Exception {
        System.out.println(Malimbica.getAsString());
        Lexer l = new Lexer(Malimbica.getAsString());
    }
}