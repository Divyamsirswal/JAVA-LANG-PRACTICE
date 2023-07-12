package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][];

//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {7, 8, 9, 12}
//        };

            //input

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // no of rows

        for (int row = 0; row < arr.length  ; row++) {
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = in.nextInt();

            }
        }

        // first way to output 2d arr

//        for (int row = 0; row < arr.length  ; row++) {
//            for (int col = 0; col < arr[row].length ; col++) {
//                System.out.print(arr[row][col] + " ");;
//            }
//            System.out.println();
//        }

        // second way to output 2d arr
//
//        for (int row = 0; row < arr.length  ; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // third way which is very enhanced way to print arr

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }

    }
}
