package com.company;

/*
Given 2 ints, a and b, return their sum. However,
sums in the range 10..19 inclusive, are forbidden,
so in that case just return 20.

sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
*/

public class SortASum {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        System.out.println(sortaSum(a,b));

        a = 9;
        b = 4;
        System.out.println(sortaSum(a,b));

        a = 10;
        b = 11;
        System.out.println(sortaSum(a,b));
    }

    private static  int sortaSum(int a, int b) {
        int sum=a+b;
        return (sum<10 || sum >19) ? sum : 20;
    }
}
