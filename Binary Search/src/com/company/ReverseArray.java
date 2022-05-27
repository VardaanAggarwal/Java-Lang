package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the number of elements that you want to enter : ");
        int n = in.nextInt();
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int[] ans = insertion(arr, n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] insertion(int[] arr , int n){
        Scanner in = new Scanner(System.in);
        System.out.println("At which position you want to insert the new number : ");
        int index = in.nextInt();
        int len = n - 1;
        for (int i = len ; i >= index ; i--) {
            arr[i+1] = arr[i];
        }
        arr[index] = in.nextInt();
        return arr;
    }
}
