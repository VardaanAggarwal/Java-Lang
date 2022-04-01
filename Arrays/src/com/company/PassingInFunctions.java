package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = in.nextInt();
        }
        Change(num);
    }

    public static void Change(int[] num) {
        num[1] = 100;
        System.out.println(Arrays.toString(num));
    }
}
