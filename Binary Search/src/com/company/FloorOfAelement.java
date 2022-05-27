package com.company;

public class FloorOfAelement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 13, 14, 18};
        int target = 18;
        int result = floor(arr,target);
        System.out.println(result);
    }
    static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start +(end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
