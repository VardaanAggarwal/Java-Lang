package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 3, 10, 918 ,71 ,0 ,99 ,-112};
        int[] result = bubbleSort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                swap(arr , i , i+1);
            }
        }
        return arr;
    }

    static void swap(int[] arr , int a , int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
