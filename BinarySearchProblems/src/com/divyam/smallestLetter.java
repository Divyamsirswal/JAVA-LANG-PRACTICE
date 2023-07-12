//package com.divyam;
//
//public class smallestLetter {
//    public static void main(String[] args) {
//        int[] arr = {"c","f","j"};
//        int target = 15;
//        int ans = floor(arr,target);
//        System.out.println(ans);
//    }
//    public char nextGreatestLetter(char[] letters, char target) {
//
//        int start = 0;
//        int end = letters.length-1;
//
//        while(start <= end){
//            //find the middle element
//            int middle = start + (end - start) / 2;
//
//            if (target < letters[middle]){
//                end = middle - 1;
//            } else {
//                start = middle + 1;
//            }
//        }
//        return letters[start % letters.length] ;
//    }
//}