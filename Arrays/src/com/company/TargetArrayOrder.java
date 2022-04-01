package com.company;

import java.util.Arrays;

public class TargetArrayOrder {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] target = createTargetArray(nums,index);
        System.out.println(Arrays.toString(target));
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < index.length-1; i++) {
                if (index[i] == index[i+1]){
                    index[i]++;
                }
        }
        for (int row = 0; row < index.length ; row++) {
            target[index[row]] = nums[row];
//            for (int i = index[row]; i < target.length ; i++) {
//                if (target[index[row]] != 0 ){
//                    target[i] = target[i+1];
//                }
//            }

        }
        return target;
    }
}
