package com.divyam;

import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr= {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12,}
        };
        int target = 34;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for (int row = 0; row < arr.length ; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (arr[row][column] == target){
                    return new int[]{row, column};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int max(int[][] arr){
        int max = Integer.MAX_VALUE;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt > max) {
                    max = anInt;
                }
            }
        }
        return max;
    }
}
