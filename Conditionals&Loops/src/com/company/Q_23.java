package com.company;

import java.util.Scanner;

public class Q_23 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int i = 1;

        while(i<=num){
            if (num%i == 0){
                System.out.println(i);
            }
            i++;
        }

    }
}
