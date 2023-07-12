package com.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //datatype[] variable_name = new datatype[];

        //eg.1
//        int[] rollNos = new int[5];
//        //or we can do this
//        int[] rnos = {32,2332,3,232,3,2};

//        int[] rolns; //declaration of array, ros is getting defined in stack.
//        rolns=new int[5]; //initialisation ,actually here object is being created in the memory (heap)

        String[] arr = new String[4];
        System.out.println(arr[0]);

        for (String element : arr){
            System.out.println(element);
        }

    }
}