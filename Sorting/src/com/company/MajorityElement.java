package com.company;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {3 , 4 , 3};
        System.out.println(majorityElement(arr));
    }

    static int majorityElement(int[] arr) {
        int counter = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            for(int j = 1 ; j < arr.length-i ; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        int i;
        for(i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] == arr[i+1]){
                counter++;
                if(counter > (arr.length/2)-1){
                    break;
                }
            } else{
                counter = 0;
            }

        }
        return arr[i];
    }
}
