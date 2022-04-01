package com.company;

import java.util.Scanner;

public class funcAge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age to know if you are eligible to cote or not : ");
        int age = in.nextInt();
        vote(age);
    }

    public static void vote(int age){
        if (age >= 18) {
            System.out.println("You are eligible to vote . ");
        } else {
            System.out.println("You are not eligible to vote . ");
        }
    }
}
