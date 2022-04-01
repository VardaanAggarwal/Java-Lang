package com.company;

public class MinElementArray {
    public static void main(String[] args) {
        int[] arr = {1211, 122, 1339, 192, 1947, 284, 211110};
        int Min = MinValue(arr);
        System.out.println(Min);
    }
    static int MinValue(int[] arr) {
        int Min = Integer.MAX_VALUE;
        int len = arr.length;
        for (int index : arr) {
            if (index < Min) {
                Min = index;
            }
        }
        return Min;
    }
}
