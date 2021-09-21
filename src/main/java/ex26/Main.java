package ex26;

import org.junit.Test;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Christine Hawkins
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("What is your balance? ");
        double balance=input.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double apr=input.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double monthly=input.nextDouble();

        PaymentCaluclator month= new PaymentCaluclator();

        System.out.println(month.calculateMonthsUntilPaidOff(balance,apr,monthly));




    }
}

