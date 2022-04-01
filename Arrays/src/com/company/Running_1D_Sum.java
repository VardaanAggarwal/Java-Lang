package com.company;

public class Running_1D_Sum {
    public static void main(String[] args) {
        int[] arr = {1,21,3,4};
        int[] arr2 = new int[4] ;
        int ref = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            ref += arr[i];
            arr2[i] = ref;
        }
        for (int i = 0 ; i < arr2.length ; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
