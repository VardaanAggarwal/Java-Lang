package com.company;

public class CeilingOfAelement {
    public static void main(String[] args) {
        int[] arr = {2 , 3 , 5 , 9 , 13 , 14 , 18 , 19 , 22};
        int target = 99;
        int result =Ceiling(arr,target);
        System.out.println(result);
    }
    static int Ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]){
            return -1;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return arr[mid];
            } else if (target < arr[mid]){
                end = mid-1;
            } else{
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
