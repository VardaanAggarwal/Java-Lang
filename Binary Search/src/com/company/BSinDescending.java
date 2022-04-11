package com.company;

public class BSinDescending {
    public static void main(String[] args) {
        int[] arr = {99, 87, 61, 55, 12, 10, -11};
        int target = 99;
        int result = BinarySearch(arr,target);
        System.out.println(result);
    }
    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                start = mid+1;
            } else if (arr[mid] < target){
                end = mid-1;
            } else if (arr[mid] == target){
                return mid;
            }
        }
        return -1;
    }
}
