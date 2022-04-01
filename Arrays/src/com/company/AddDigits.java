package com.company;

public class AddDigits {
    public static void main(String[] args) {
        int sum = 2212;
        System.out.println(AddDigits(sum));

    }
    public static int AddDigits(int num) {
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num = num / 10;

            if (num == 0 && digitalRoot > 9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }
        return digitalRoot;
    }
    public static int addDigits(int num) {
        int sumOfDigits = 0;
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            sumOfDigits = sumOfDigits + digit;
            num /= 10;
        }
        int output = countDigits(sumOfDigits);
        return output;

    }

    static int countDigits(int sum) {
        int count = 0;
        while (sum > 0) {
            count++;
            sum /= 10 ;
        }
        return count;

    }
}
