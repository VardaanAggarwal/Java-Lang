package com.company;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {4, 7, 6},
                {7, 8, 7}
        };
        int target = 7;

        int apperance = Search(arr2D , target);
        System.out.println("Target appears " + apperance + " times in the 2D Array . ");

    }
    static int Search(int[][] arr , int target) {
        int flag = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == target) {
                    flag++;
                }
            }
        }
        return flag;
    }
}
