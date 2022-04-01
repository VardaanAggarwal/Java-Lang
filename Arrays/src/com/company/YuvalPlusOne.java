package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class YuvalPlusOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        while(test > 0) {
            test--;
            int questions = in.nextInt();
            int correct = in.nextInt();
            int wrong = questions - correct;
            int marks = 3*correct - 1*wrong;
            int passing = in.nextInt();
            if(marks>=passing){
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }
    }
}
