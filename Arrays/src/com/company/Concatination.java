package com.company;

import java.util.Arrays;

public class Concatination {
    public static void main(String[] args) {
        int[] nums = {1,2,3,99};
        int[] nums2 = getConcatenation(nums);
        System.out.println(Arrays.toString(nums2));
    }

    static int[] getConcatenation(int[] nums) {
        int b = nums.length;
        int[] nums2 = new int[2*b];
        int a = 0;
        for(int i = 0 ; i < b ; i++) {
            nums2[i] = nums[i];
        }
        for(int i = 0 ; i < b ; i++) {
            nums2[b+i] = nums[i];
        }
        return nums2;
    }
}
