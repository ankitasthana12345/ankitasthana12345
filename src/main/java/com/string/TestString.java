package com.string;

public class TestString {


    public static void main(String[] args) {
        String s = new String("durga");
        System.out.println(s);
        String d = s.concat(" software");
        System.out.println(d);
        System.out.println("=============String Buffer==========================");
        StringBuffer sb = new StringBuffer("Durga");
        sb.append(" Software");
        System.out.println(sb);
    }
}
