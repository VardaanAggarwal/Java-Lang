package com.company;

import java.util.Arrays;

public class PlusOneTwo {
    public static void main(String[] args) {
        int[] arr = {9,89};
        int[] arr2 = PlusOne(arr);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Integer.MIN_VALUE);

    }
    static int[] PlusOne(int[] arr) {
        int sum = 0 , ref , start = 0;
        int[] arr2 = new int[arr.length + 1];
        int end = arr2.length - 1;
        int flag = 0;
        for (int index = 0; index < arr.length; index++) {
            int a = arr[index];
            sum = sum*10 + a;
        }
        sum++;
        for (int i = 0 ; i < arr2.length ; i++) {
            ref = sum%10;
            arr2[i] = ref;
            sum = sum/10;

        }
//        int i = 0 ;
//        while( sum != 0 ) {
//            ref = sum%10;
//            arr2[i] = ref;
//            sum = sum/10;
//            i++;
//            flag++;
//        }
         while(start < end){
             Swap(arr2 , start , end);
             start++;
             end--;
         }
//        arr2[0] = arr2[0]+flag;
        return arr2;

    }
    static void Swap(int[] arr , int start , int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
