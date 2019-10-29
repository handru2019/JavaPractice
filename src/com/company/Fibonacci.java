package com.company;

/*
The fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition.
The first two values in the sequence are 0 and 1 (essentially 2 base cases).
Each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
Define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence.

fibonacci(0) → 0
fibonacci(1) → 1
fibonacci(2) → 1
 */

public class Fibonacci {

    public static void main(String[] args) {
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 2;
        int forthNumber = 3;

        System.out.println(getFibonacciNumber(firstNumber));
        System.out.println(getFibonacciNumber(secondNumber));
        System.out.println(getFibonacciNumber(thirdNumber));
        System.out.println(getFibonacciNumber(forthNumber));
    }

    private static int getFibonacciNumber(int n) {
        if(n == 0 || n == 1)
            return n == 0 ? 0 : 1;

        return getFibonacciNumber(n - 2) + getFibonacciNumber(n - 1);
    }

}
