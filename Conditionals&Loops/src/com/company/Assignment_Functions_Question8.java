package com.company;

import java.util.Scanner;

public class Assignment_Functions_Question8 {
    public static void main(String[] args) {
        grades();
    }
    static void grades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your marks : ");
        int marks = in.nextInt();
//        switch (marks) {
//            case (marks>=91 && marks<=100) -> System.out.println("AA");
//            case (marks>=81 && marks<=90) -> System.out.println("AB");
//            case (marks>=71 && marks<=80) -> System.out.println("BB");
//            case (marks>=61 && marks<=70) -> System.out.println("BC");
//            case (marks>=51 && marks<=60) -> System.out.println("CD");
//            case (marks>=41 && marks<=50) -> System.out.println("DD");
//            default -> System.out.println("Fail");
//        }
        if (marks>=91 && marks<=100){
            System.out.println("AA");
        }
        else if (marks>=81 && marks<=90){
            System.out.println("AB");
        }
        else if (marks>=71 && marks<=80){
            System.out.println("BB");
        }
        else if (marks>=61 && marks<=70){
            System.out.println("BC");
        }
        else if (marks>=51 && marks<=60){
            System.out.println("CD");
        }
        else if (marks>=41 && marks<=50){
            System.out.println("DD");
        }
        else{
            System.out.println("Fail");
        }


    }
}
