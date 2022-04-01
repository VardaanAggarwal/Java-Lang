package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Important Instructions , If you want to come out of the loop then please enter x or X . ");
        int result = 0;
        System.out.print("Enter the operator :");
        char op = in.next().trim().charAt(0);
        System.out.print("Enter 2 numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        while (true){
            if (op=='+' || op=='-' || op=='*' || op=='%' || op=='/' ){
                if (op=='+'){
                    result = num1+num2;
                }
                if (op=='-'){
                    result = num1-num2;
                }
                if (op=='/'){
                    result = num1/num2;
                }
                if (op=='*'){
                    result = num1*num2;
                }
                if (op=='%'){
                    result = num1%num2;
                }
            } else if(op=='x' || op=='X'){
                break;
            } else{
                System.out.println("Invalid Output !!!");
            }
            System.out.println(result);
        }


    }
}
