package com.company;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 6;
        int result = searchInsert(nums , target);
        System.out.println(result);
    }
    static int searchInsert(int[] nums, int target) {
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == target){
                return index;
            }
        }
        for (int index = 0; index < nums.length-1; index++) {
            if ((target > nums[index] && target < nums[index+1])){
                return index+1;
            }
        }
        if (target < nums[0]){
            return 0;
        }
        if (target > nums[nums.length-1]){
            return nums.length;
        }
        return -1;
    }
}
