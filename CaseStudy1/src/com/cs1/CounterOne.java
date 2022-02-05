package com.cs1;

import java.util.Scanner;

class CounterOne extends PCounter {
    Scanner p1 = new Scanner(System.in);
    int Payment, Receipt;
    @Override
    void process() {
        System.out.println("Cost of the Product is $100");
        System.out.println("Enter Payment Status"+ "\n" + "1.Done" + "\n" + "2. Not Done");

        Payment = p1.nextInt();
        if(Payment ==1) {
            System.out.println("Payment is done");
            System.out.println("Enter Receipt Status"+ "\n" + "1.Done" + "\n" + "2. Not Done");

            Receipt = p1.nextInt();
            if(Receipt ==1){
                System.out.println("Receipt is provided");
                System.out.println("Your Product is: " + ProductCounters.productno + "\n"
                + "Payment done" + "\n" + "Receipt Given");
            }//end of if
            else if (Payment ==2){
                System.out.println("Payment is not done");
            }
        }

    }
}
