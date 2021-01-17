package com.toby;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        // better than magic numbers
        final byte MONTHS_IN_YEAR = 12;
        final byte PRECENT = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");

////        Method 1
//        System.out.print("principal ($1K - $1M): ");
//        int principal = scanner.nextInt();
//        while (principal < 1000 || principal > 1_000_000){
//            System.out.println("Enter a number between 1,000 and 1,000,000.");
//            System.out.print("principal ($1K - $1M): ");
//            principal = scanner.nextInt();
//            // can use while true + a if break condition here
//            // notice you need to init principal either way.
//            // otherwise it will only be available inside the {} block
//        }
////        Method 2
        int principal = 0;
        while(true){
            System.out.print("principal ($1K - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        System.out.print("Annual Interest Rate (0-30) in percentage: ");
        float annualInterestRate = scanner.nextFloat();
        while (annualInterestRate<0 || annualInterestRate>30){
            System.out.println("Enter a value between 0 and 30");
            System.out.print("Annual Interest Rate (0-30) in percentage: ");
            annualInterestRate = scanner.nextFloat();
        }
        float monthInterestRate = annualInterestRate / PRECENT / MONTHS_IN_YEAR;

        System.out.print("Period (years): ");
        int years = scanner.nextInt();
        while (years < 1 || years > 30){
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (years): ");
            years = scanner.nextInt();
        }
        int numberOfPayment = years * MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthInterestRate * Math.pow(1+monthInterestRate, numberOfPayment))
                / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
