package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
	// write your code here
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        int flag = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
                swap(arr, findMax(arr, 0, flag-1 ), flag);
                flag--;
        }
    }
    static int findMax(int[] arr, int start, int end){
        int max = 0;
        int i;
        for (i = start; i <= end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static void bubble(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
