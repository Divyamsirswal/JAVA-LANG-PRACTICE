package com.divyam;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer here : ");
        int number = in.nextInt();
        System.out.print("Enter the no you want to find ? : ");
        int occ = in.nextInt();
        int count=0,rem,sum=0;
        while (number!=0) {
            rem=number%10;
            number/=10;
            if(rem==occ){
                count++;
            }
        }

        System.out.println("The no appears "+count+" "+"times");


    }
}
