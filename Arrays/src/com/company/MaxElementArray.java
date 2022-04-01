package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {11, 12, 13, 141, 15, 16, 17};
        System.out.print("Enter the Starting point of the range : ");
        int start = in.nextInt();
        System.out.print("Enter the Ending point of the range : ");
        int end = in.nextInt();
        System.out.println(MaxRange(arr , start , end ));
        System.out.println(Arrays.toString(arr));

    }
    // This function is to find the maximum element in between two points .
    static int MaxRange(int[] arr , int Start , int End) {
        int max = Integer.MIN_VALUE;
        for (int index = Start; index <= End ; index++) {
            if (max < arr[index]) {
                max = arr[index];
            }
        }
        return max;
    }
    // This function is to find the maximum element in the whole array.
    static int Max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
}
