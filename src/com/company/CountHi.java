package com.company;

/*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */

public class CountHi {

    public static void main(String[] args) {
        String firstWord = "hiHIhi";
        String secondWord = "ABChi hi";
        String thirdWord = "Hihi";

        System.out.println(countHi(firstWord));
        System.out.println(countHi(secondWord));
        System.out.println(countHi(thirdWord));
    }

    private static int countHi(String str) {
        int count = 0;
        str = str.toLowerCase();
        
        while(str.contains("hi")) {
            str = str.replaceFirst("hi", "");
            count++;
        }
        return count;
    }

}
