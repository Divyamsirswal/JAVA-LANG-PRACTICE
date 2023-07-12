package com.arrays;

public class Maxitems {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,2342,423,12,-1};
        System.out.println(maxRange(arr,1,3));
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static int maxRange(int[] arr, int start , int end ){
        int max = arr[start];
        for (int i = start; i <= end ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
