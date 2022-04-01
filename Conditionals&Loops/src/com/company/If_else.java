package com.company;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Enter your salary : ");
        int salary = in.nextInt();
        if (salary>=10000){
            salary += 2000;
            System.out.println("Your total salary after bonus is " + salary);
        } else{
            salary += 1000;
            System.out.println("Your total salary after bonus is " + salary);
        }



    }
}
