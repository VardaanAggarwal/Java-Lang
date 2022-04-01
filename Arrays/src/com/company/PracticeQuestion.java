package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=5;
        int K=2;
        int x=Integer.MAX_VALUE;
        int[] A={4 ,3, 4, 3, 5};
        if(K < N-1) {
            for (int j = 1; j <= K; j++) {
                A[j + 1] = A[j];
            }
        }else{
            for (int j = 1; j < N-1 ; j++) {
                A[j + 1] = A[j];
            }
        }
        for(int i=1;i<N;i++){
            if(A[i]<x){
                x=A[i];
            }
        }
        System.out.println(x);
    }
}
