package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0]=23;
//        arr[1]=45;
//        arr[2]=223;
//        arr[3]=4235;
//        arr[4]=2243;
//
//        System.out.println(arr[3]);

//        //inputing array using loop concept
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i]=in.nextInt();
//        }
//
//        for (int j : arr) {
//            System.out.println(j + " ");
//        }

        String[] str = new String[4];
        for (int i = 0; i <str.length ; i++) {
            str[i]= in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
