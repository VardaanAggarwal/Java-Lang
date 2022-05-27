package com.company;
import java.util.*;
public class Practice {
    public static void main(String[] args) {
        int counter = 0 ;
        int[] arr = {1, 2};
        int[] arr2 = {1, 2, 3};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        if(arr.length < arr2.length){
            for (int i = 0; i < arr.length; i++) {
                    if(arr[i] == arr2[i]){
                        counter++;
                    }
            }
        }
        else{
            for (int i = 0; i < arr2.length; i++) {
                    if(arr2[i] == arr[i]){
                        counter++;
                    }
            }
        }
        if(counter == arr.length || counter == arr2.length){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

    static int binarySearchOp(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length - 1;
        while (start <= end)
        {
            int mid = (start+end)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if (target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int m =  nums1.length;
            int n = nums2.length;
            int o = m+n;
            int[] nums = new int[o];
            for(int i = 0 ; i < m ; i++){
                nums[i] = nums1[i];
            }
            int a = 0;
            for(int i = m ; i < n+m ; i++){
                nums[i] = nums2[a];
                a++;
            }
            Arrays.sort(nums);
            int start = 0 ;
            int end = nums.length - 1;
            double median ;
            int mid = start + (end-start)/2;
            double k = nums[mid];
            double l = nums[mid+1];
            if(nums.length % 2 == 0){
                median = (l+k)/2;
            } else{
                median = nums[mid];
            }
            return median;

        }
}
