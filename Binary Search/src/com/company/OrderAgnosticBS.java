package com.company;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};
        int target = 7;
        int result = OrderAgnosticBS(arr , target);
        System.out.println(result);
    }
    static int OrderAgnosticBS(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            boolean isAsc = arr[start] < arr[end];
            if(arr[mid] == target){
                return mid;
            }
            if (isAsc){
                if(arr[mid] < target){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            } else{
                if(arr[mid] > target){
                    start = mid+1;
                } else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
