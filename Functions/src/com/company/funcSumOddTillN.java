package com.company;

import java.util.Scanner;

public class funcSumOddTillN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(sumOddN(n));

    }
    public static int sumOddN(int n){
        int sum = 0;
        for (int i = 1; i <=(n-1) ; i=i+2) {
            sum = sum+i;
        }
        return sum;
    }
}
