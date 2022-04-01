package com.company;

import java.util.Arrays;

public class transpose2dmatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] arr2 = trans(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }
    }
    static int[][] trans(int[][] arr){
        int[][] arr2 = new  int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr2[i][j] = arr[j][i];
            }
        }
        return arr2;
    }
}
