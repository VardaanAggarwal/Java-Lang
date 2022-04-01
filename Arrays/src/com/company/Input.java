package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // arrays of primitives
        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 53;
//        arr[2] = 82;
//        arr[3] = 71;
//        arr[4] = 998;
        // [ 12, 53, 82, 71, 998 ]
//        System.out.println(arr[2]);

        //input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] += 1;
//            System.out.print(arr[i] + " ");
//        }

        //Enhanced for loop
//        for (int num : arr) { // for every element in array , print the element
//            System.out.print(num + " "); // here num represents element of the array
//        }

//        System.out.println(arr[5]); // index out of bound
//        System.out.println(Arrays.toString(arr));

        // array of objects
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

//        for (int i = 0; i < str.length; i++) {
//            System.out.print(str[i]);
//        }

        for (String element : str) {
            System.out.println(element);
        }
//        System.out.println(Arrays.toString(str));

        // modify
//        str[1] = "Vardaan";
//        System.out.print(Arrays.toString(str));
    }
}
