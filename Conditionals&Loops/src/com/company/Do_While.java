package com.company;

import java.util.Scanner;

public class Do_While {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n , marks , total = 0 , total_marks , count = 0;
        do {
            System.out.print("Enter either 1 or 0 , 1 for keep inputting number and 0 to stop and give the result : ");
            n = in.nextInt();
            if (n==1){
                System.out.print("Input the marks of the student : ");
                marks = in.nextInt();
                total = total+marks;
                count++;
            } else if (n==0){
                break;
            }
        } while (true);
        total_marks = total/count;
        System.out.println("The total marks of the student is "+total_marks+" . ");
        if (total_marks>=90){
            System.out.println("This is Good");
        } else if (total_marks>=60){
            System.out.println("This is also Good");
        } else {
            System.out.println("This is Good as well");
        }
    }
}
