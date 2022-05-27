package com.company;
public class CeilingNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 3;
        int result = Ceiling(arr , target);
        System.out.println(result);
    }
    static int Ceiling(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            boolean isAsc = arr[start] < arr[end];
//            if(arr[mid] == target){
//                return mid;
//            }
            if (isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            } else {
                if(arr[mid] > target){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return start;
    }
}
