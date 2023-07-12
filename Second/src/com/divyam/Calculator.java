package com.divyam;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        //take the input from the user till user press x or X
        while (true){
            //take the opperator as input
            System.out.print("Enter the operator : ");
            char op=in.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                //inputing two numbers here
                System.out.print("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if (op=='+'){
                    ans = num1+num2;
                }
                if (op=='-'){
                    ans = num1-num2;
                }
                if (op=='*'){
                    ans = num1*num2;
                }
                if (op=='/'){
                    if (num2!=0){
                        ans=num1/num2;
                    }
                }
                if (op=='%'){
                    ans = num1%num2;
                }
            } else if (op=='x' || op=='X') {
                break;
            }else{
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
        }

    }
}
