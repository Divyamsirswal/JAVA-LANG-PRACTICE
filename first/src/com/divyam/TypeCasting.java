package com.divyam;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //float num = input.nextFloat();
        //int num = input.nextInt();

        //Type Casting
//        int num = (int)12.212f;
//        System.out.println(num);

        //AutoMatic type promotion in expressions
//        int a=257;
//        byte b = (byte) (a); // 257%256=1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//
//        int d = (a * b) / c;
//
//        System.out.println(d);

//        byte b = 50;
//        b=b*2;

//        int number='a';
//        System.out.println(number);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b) + " " +  (i/c) + " " +  (d*s));
        System.out.println(result);
    }
}
