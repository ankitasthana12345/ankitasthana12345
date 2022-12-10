package com.string;

public class TestStringOperators {

    public static void main(String[] args) {
        String s1 = new String("durga");
        String s2 = new String("durga");

        String s3="durga";
        String s4="durga";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println("=======String Buffer==========");

        StringBuffer sb1 = new StringBuffer("durga");
        StringBuffer sb2 = new StringBuffer("durga");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));

    }
}
