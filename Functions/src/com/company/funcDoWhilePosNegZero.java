package com.company;
import java.util.Scanner;

public class funcDoWhilePosNegZero {
    public static void main(String[] args) {
        countOfNumbers();
    }
    public static void countOfNumbers(){
        Scanner in = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero = 0;
        do {
            System.out.print("Do you want to continue entering a number (yes or no) : ");
            String ans = in.next();
            if (ans.equals("yes") || ans.equals("Yes") || ans.equals("YES")) {
                System.out.print("Enter a number : ");
                int num = in.nextInt();
                if (num<0) {
                    negative++;
                } else if (num>0) {
                    positive++;
                } else {
                    zero++;
                }
            }
            else if (ans.equals("no") || ans.equals("NO") || ans.equals("No")) {
                break;
            }
        } while(true);
        System.out.println("The amount positive numbers you have entered are : "+positive);
        System.out.println("The amount negative numbers you have entered are : "+negative);
        System.out.println("The amount of zeros you have entered are : "+zero);
    }
}
