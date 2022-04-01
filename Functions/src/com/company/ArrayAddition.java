package com.company;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {9,8,7,6,5};
        int[] arr3 = {};
        for (int i = 0; i < 4; i++) {
            arr3[i] = arr[i]+arr2[i];
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(arr3[i]);
        }
    }
}
