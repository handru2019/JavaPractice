package com.company;

/*
Given three ints, a b c, return true if it is possible to add two of the ints to get the third.

twoAsOne(1, 2, 3) → true
twoAsOne(3, 1, 2) → true
twoAsOne(3, 2, 2) → false
*/

public class TwoAsOne {

    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber = 2;
        int thirdNumber = 3;

        System.out.println(twoAsOne(firstNumber, secondNumber, thirdNumber));
    }

    private static boolean twoAsOne(int a, int b, int c) {
        boolean result = false;

        if(a + b == c) {
            result = true;
        } else if (a + c == b) {
            result = true;
        } else if(b + c == a) {
            result = true;
        }

        return result;
    }

}
