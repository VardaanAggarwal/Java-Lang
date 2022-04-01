package com.company;

public class Tutorial {

    public static void main(String[] args) {
	// write your code here
        //Q. Store a roll number
        int a = 17;
        int b = 19;

        // Q: Store a person's name
        String name = "Vardaan Aggarwal";

        // Q: Store 5 roll numbers
        int rnos1 = 1;
        int rnos2 = 2;
        int rnos3 = 3;

        //What if we have to store 100 roll numbers, would we write this again and again .
        //Array is the solution for this problem
        // Syntax
        // datatype[] variable_name = new datatype[size];
        // Q: Store 5 roll numbers
        int[] rollnos = new int[5];

        //or directly
        int[] rollnos2 = {12,24,39,248,30};

        int rnos[] ; //declaration of an array . rnos is getting defined in the stack .
        rnos = new int[5]; // initialisation : actual memory creation is happening here.
        rnos[1] = 19;
        System.out.println(rnos[1]);

        String[] str = new String[5];
        System.out.println(str[1]);
    }
}
