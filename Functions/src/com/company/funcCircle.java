package com.company;

import java.util.Scanner;

public class funcCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();
        System.out.println("The circumference of the circle of the given radius "+rad(rad));

    }
    public static int rad(int rad) {
        int circumference = (2*22*rad)/7 ;
        return circumference;
    }
}
