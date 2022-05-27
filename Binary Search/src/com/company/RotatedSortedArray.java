package com.company;

public class RotatedSortedArray {
        public static void main(String[] args) {
            int[] arr = {1};
            int target = 0;
            System.out.println(search(arr, target));
        }
        static int search (int[] arr, int target){
            int pivot = rotatedSorted(arr);
            int firstTry = BinarySearch(arr, target, 0 , pivot);
            if(pivot == -1){
                return BinarySearch(arr, target, 0, arr.length-1);
            }
            if(target >= arr[0]){
                return BinarySearch(arr, target, 0, pivot);
            } else{
                return BinarySearch(arr, target , pivot+1 , arr.length - 1);
            }
        }
        public static int rotatedSorted(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
            while(start <= end){
                int mid = start + (end-start)/2;
                if(mid < end && arr[mid] > arr[mid+1]){
                    return mid;
                }
                if( mid > start && arr[mid] < arr[mid-1]) {
                    return mid - 1;
                }
                if(arr[mid] >= arr[start]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
        static int BinarySearch(int[] arr, int target , int start , int end){
            while (start <= end){
                int mid = start + (end-start) / 2;
                if(target == arr[mid]){
                    return mid;
                }
                else if ( target < arr[mid]){
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            return -1 ;
        }
}
