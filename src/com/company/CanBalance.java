package com.company;

/*

Given a non-empty array, return true if there is a place to split the array
so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */

public class CanBalance {


    public static void main(String[] args) {
        int[] initialTab1 = {1, 4, 5};       // true
        int[] initialTab2 = {1, 4, 5, 2};    // false
        CanBalance canBalanceObj = new CanBalance();
        System.out.println(canBalanceObj.canBalance(initialTab1));
        System.out.println(canBalanceObj.canBalance(initialTab2));
    }

    public boolean canBalance(int[] nums) {
        int sumFront = 0;
        int sumEnd = 0;
        int sumAll = 0;

        for(int j = 0; j < nums.length; j++) {
            sumAll += nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            sumFront += nums[i];
            sumEnd = sumAll - sumFront;
            if (sumFront == sumEnd) {
                return true;
            }
        }
        return false;
    }
}
