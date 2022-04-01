package com.company;

public class CountNum {
    public static void main(String[] args) {
        long n = 99999999999l;
        int count = 0 ;

        while (n>0){
            long rem = n % 10 ;
            if (rem==9){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);


    }
}
