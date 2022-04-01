package com.company;

import java.util.Scanner;

public class funcTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();
        table(num);
    }
    public static void table(int num){
        //loop
        for (int i = 1; i <=10 ; i++) {
            int table = i*num;
            System.out.println(num+"x"+i+"="+table);
        }
    }
}
