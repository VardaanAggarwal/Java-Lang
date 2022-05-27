package com.company;

public class SquaresSortedArray {
    public static void main(String[] args) {

    }
    public int[] sortedSquares(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i]*nums[i];
        }

        return nums;
    }
}

