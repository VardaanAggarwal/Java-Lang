package com.company;

public class SingleOrder {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1};
        int result = singleNumber(nums);
        System.out.println(result);
    }
    static int singleNumber(int[] nums){
        int flag = 1;
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    flag++;
                }
            }
            if(flag == 2){
                return nums[i];
            }
            flag = 1;
        }
        return -1;
    }
}
