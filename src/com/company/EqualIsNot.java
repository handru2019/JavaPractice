package com.company;

/*
Given a string, return true if the number of appearances of "is" anywhere in the string is
equal to the number of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
 */

public class EqualIsNot {

    public static void main(String[] args) {
        String firstWord = "This is not";
        String secondWord = "noisxxnotyynotxisi";

        System.out.println(checkNumber(firstWord));
        System.out.println(checkNumber(secondWord));
    }

    private static boolean checkNumber(String word) {
        int countIsWord = 0;
        int countNotWord = 0;
        boolean itContainsIs;

        word = word.toLowerCase();

        while((itContainsIs = word.contains("is")) || word.contains("not")) {
            if(itContainsIs) {
                word = word.replaceFirst("is", "");
                countIsWord++;
            } else {
                word = word.replaceFirst("not", "");
                countNotWord++;
            }
        }
        return countIsWord == countNotWord;
    }

}
