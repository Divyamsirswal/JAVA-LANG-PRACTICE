package com.divyam;

public class Main {
    public static void main(String[] args) {
        int[] nums = {23,45,1,2,8,19,-3,16,-11,28};
        int target = 19;
        int answer = linearSearch(nums,target);
        System.out.println(answer);
    }
    //search the target and return the true or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }
    //search the target and return the element itself
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }
    //search in the array: return the index if item found
    //otherwise if item not found : return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element =arr[index];
            if (element == target){
                return index;
            }
        }

        return -1;
    }
    
}