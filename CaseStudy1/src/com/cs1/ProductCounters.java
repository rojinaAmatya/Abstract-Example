package com.cs1;

import java.util.Scanner;

public class ProductCounters {
    static int product;
    static String productno;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to our Market");
        System.out.println("-----------------------");
        System.out.println("Please enter the choice");
        System.out.println("1. Product One" + "\n" + "2. Product Two"+"\n"+"3. Product Three");
        product = sc.nextInt();

        if(product ==1){
            PCounter c1 = new CounterOne();
            productno ="ProductOne";
            c1.process();
        }
        else if(product ==2){
            PCounter c1 = new CounterOne();
            productno ="ProductTwo";
            c1.process();
        }
        else if(product ==3){
            PCounter c1 = new CounterOne();
            productno ="ProductThree";
            c1.process();
        }
    }
}
