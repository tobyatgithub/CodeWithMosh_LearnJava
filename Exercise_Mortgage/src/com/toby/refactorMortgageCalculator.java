package com.toby;

import java.text.NumberFormat;
import java.util.Scanner;

public class refactorMortgageCalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");
        int principal = (int)readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterestRate = (float)readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte)readNumber("Period (years): ", 1, 30);

        double mortgage = calculatMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max){
        Scanner scanner = new Scanner(System.in);
        double value;
        while(true){
            System.out.print(prompt);
            value = scanner.nextInt();
            if (value >= min && value <= max)
                break;
            System.out.println("Enter a number between " + min + " and " + max);
        }
        return value;
    }


    public static double calculatMortgage(
            int principal,
            float annualInterestRate,
            byte years){
        final byte MONTHS_IN_YEAR = 12;
        final byte PRECENT = 100;

        short numberOfPayment = (short)(years * MONTHS_IN_YEAR);
        float monthInterestRate = annualInterestRate / PRECENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthInterestRate * Math.pow(1+monthInterestRate, numberOfPayment))
                / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);

        // add remaining amount of mortgage print
        double remaningBalance = 0;
        for (int i = 0; i < numberOfPayment; i++){
            remaningBalance = principal
                    * (Math.pow(1+monthInterestRate, numberOfPayment) - Math.pow(1+monthInterestRate, i))
                    / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);
            System.out.println(NumberFormat.getCurrencyInstance().format(remaningBalance));
        }
        return mortgage;
    }
}

