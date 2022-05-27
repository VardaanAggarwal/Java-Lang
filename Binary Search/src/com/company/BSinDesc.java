package com.company;

public class BSinDesc {
    public static void main(String[] args) {
        int[] arr = {8 , 7 , 6 , 5 , 4 , 3 , 2 , 1 };
        int target = 7;
        int result = BinarySearch(arr,target);
        System.out.println(result);
    }

    static int BinarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target > arr[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return -1;
    }

}
