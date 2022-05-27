package com.company;

import java.util.Arrays;

public class RangeOfTarget {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 7, 7, 7, 7};
        int target = 9;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start = ok(nums, target, true);
        int end = ok(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int ok(int[] arr, int target, boolean isStart){
        int start = 0 ;
        int end = arr.length - 1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(isStart){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
