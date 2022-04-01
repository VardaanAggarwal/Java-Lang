package com.company;

import java.util.Arrays;

public class SwapingIndices {
    public static void main(String[] args) {
        int[] arr = {8, 17, 61, 99, 171};
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(end>start) {
            Swap(arr , start , end);
            start++;
            end--;
        }
    }

    static void Swap(int[] arr, int Index1, int Index2) {
        int temp = arr[Index1];
        arr[Index1] = arr[Index2];
        arr[Index2] = temp;
    }
}
