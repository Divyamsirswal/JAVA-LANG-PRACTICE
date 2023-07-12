package com.divyam;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer here : ");
        int no = in.nextInt();
        int rem = 0,sum=0;
        System.out.print("The reverse of this integer is : ");
        while (no!=0){
            rem=no%10;
            sum+=rem;
            no/=10;
            System.out.print(rem);
        }



    }
}
