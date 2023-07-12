package com.divyam;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //For loop Syntax -----
//        for (int i=1;i<=5;i+=2){
//            System.out.println(i);
//        }
        //printing no from 1 to n
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the range you want in a loop : ");

        int n= in.nextInt();

//        for (int i=1;i<=n;i++){
////            System.out.print(i +" ");
//            System.out.println("Hello World");
//        }
        int num =1;
        while (num<=n){
            System.out.println(num);
            num++;
        }
    }
}
