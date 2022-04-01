package com.company;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Case Check program : ");
        char ch = in.next().trim().charAt(0);
        if (ch>='a' && ch<='z'){
            System.out.println("Lowercase");
        } if (ch>='A' && ch<='Z'){
            System.out.println("Uppercase");
        } else{
            System.out.println("Invalid Input");
        }
    }
}
