package com.company;

public class SingleElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 79;
        int result = index(arr, target);
        System.out.println(result);
    }
    static int index(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target == arr[mid]){
                return mid;
            } else if(target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
