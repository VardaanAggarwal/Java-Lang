package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Degree90 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        int size = in.nextInt();
        int[][] mat = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mat[i][j] = in.nextInt();
            }
        }


    }
    static boolean findRotation(int[][] mat , int[][] target){
        rotate(mat);
        int hello = 0;
        for (hello = 0; hello < 4; hello++) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    if (target[i][j] == mat[i][j]){
                        continue;
                    } else{
                        rotate(mat);
                    }
                }
            }
        }
        if(hello < 3){
            return true;
        } else{
            return false;
        }
    }
    static void rotate(int[][] mat){
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        int start = 0;
        int end = mat.length - 1;
        for (int i = 0; i < mat.length; i++) {
            while (start < end){
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
    }

}
