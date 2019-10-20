package com.company;

/*
Given two strings, a and b, create a bigger string made of the first char of a,
the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public class MixString {
    public static void main(String[] args) {
        String a = "abc";
        String b = "xyz";
        System.out.println(mixString(a,b));

        a = "Hi";
        b = "There";
        System.out.println(mixString(a,b));

        a = "xxxx";
        b = "There";
        System.out.println(mixString(a,b));
    }

    private static String mixString(String a, String b) {
        int maxLength = Math.max(a.length(), b.length());

        StringBuilder builder= new StringBuilder();
        for (int i=0; i < maxLength; i++) {
            if(i<a.length()) builder.append(a.charAt(i));
            if(i<b.length()) builder.append(b.charAt(i));
        }
        return builder.toString();
    }
}
