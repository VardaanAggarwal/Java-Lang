package com.company;

public class BSinAscending {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 7, 8};
        int target = 5;
        int result = BinarySearch(arr,target);
        System.out.println(result);
    }
    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] < target){
                start = mid+1;
            } else if (arr[mid] > target){
                end = mid-1;
            } else if (arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
