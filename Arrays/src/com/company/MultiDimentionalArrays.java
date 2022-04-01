package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        /*
             1 2 3
             4 5 6
             7 8 9
        */
        //syntax

        int[][] arr = new int[3][2]; // from this 3x3 array has been formed
//        System.out.println(arr.length); // no of rows
        //input

        for (int rows = 0 ; rows < arr.length ; rows++) {
            // for each col in every row
            for (int col = 0 ; col < arr[rows].length ; col++) {
                arr[rows][col] = in.nextInt();
            }
        }
        // output -- > Method 1

//        for (int rows = 0 ; rows < arr.length ; rows++) {
//            System.out.println(Arrays.toString(arr[rows]));
//        }


        // output -- > Method 2
//        for (int rows = 0 ; rows < arr.length ; rows++) {
//            // for each col in every row
//            for (int col = 0 ; col < arr[rows].length ; col++) {
//                System.out.print(arr[rows][col] + " ");
//            }
//            System.out.println();
//        }

        // Output -- > Method 3

        for (int[] num : arr) {
            System.out.println(Arrays.toString(num));
        }




        // Declaration and initilisation of array
//        int[][] arr = {
//                {1 , 2 , 3}, // 0th index
//                {4 , 5}, //1st index
//                {6 , 7 , 8 , 9} //2nd index -> arr[2] -> {6, 7, 8, 9}
//        };

//        int[][] arr2 = new int[3][];//specifying the rows in a 2D array is compulsory
        //but not specifying the columns will work.


//        int[][] arr3 = new int[][2]; // as you can observe it is giving an error

    }
}
