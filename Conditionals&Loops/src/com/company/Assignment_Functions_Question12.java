package com.company;

import java.util.Scanner;

public class Assignment_Functions_Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a , b , c ;
        System.out.print("Enter the first side of triangle : ");
        a = in.nextInt();
        System.out.print("Enter the second side of triangle : ");
        b = in.nextInt();
        System.out.print("Enter the third side of triangle : ");
        c = in.nextInt();

        Py(a,b,c);
    }

    static void Py(int a ,int b ,int c){
        if ((a*a)+(b*b)==(c*c)){
            System.out.println("This is the Pythagorean Triplet .");
        }
        else if ((a*a)+(c*c)==(b*b)){
            System.out.println("This is the Pythagorean Triplet .");
        }
        else if ((c*c)+(b*b)==(a*a)){
            System.out.println("This is the Pythagorean Triplet .");
        }
        else{
            System.out.println("This is not a Pythagorean Triplet . ");
        }
    }
}
