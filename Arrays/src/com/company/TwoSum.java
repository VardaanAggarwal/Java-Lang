package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 14;
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }
    static int[] twoSum(int[] arr , int target){
        int[] result = new int[2];
        for (int index1 = 0; index1 < arr.length; index1++) {
            for (int index2 = index1+1; index2 < arr.length; index2++) {
                if ((arr[index1]+arr[index2]) == target) {
                    result[0] = index1;
                    result[1] = index2;
                    return result;
                }
            }
        }
        return result;
    }
}
