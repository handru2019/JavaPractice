package com.company;

public class Sum28 {

/*
Given an array of ints,
return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */


    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2, 2, 4, 2, 7};
        System.out.println(sum28(nums1));

        int[] nums2 = {2, 3, 2, 2, 4, 2, 2, 7};
        System.out.println(sum28(nums2));

        int[] nums3 = {1, 2, 3, 4};
        System.out.println(sum28(nums3));
    }


    private static boolean sum28(int[] nums) {
        int sum=0;
        for (int number : nums){
            if (number==2) {
                sum += number;
            }
        }
        return sum==8;
    }
}
