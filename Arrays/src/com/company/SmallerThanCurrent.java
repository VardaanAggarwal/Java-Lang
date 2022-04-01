package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] nums2 = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(nums2));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] nums2 = new int[len];
        int flag = 0;
        for(int index = 0 ; index < len ; index++) {
            flag = 0 ;
            for (int i = 0 ; i < len ; i++) {
                if (nums[i] < nums[index]){
                    flag++;
                }
            }
            nums2[index] = flag;
        }
        return nums2;
    }
}
