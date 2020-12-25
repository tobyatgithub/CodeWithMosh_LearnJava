package com.toby;

import java.text.NumberFormat;
import java.util.Scanner;

public class refactorMortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");
        int principal = (int)readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterestRate = (float)readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte)readNumber("Period (years): ", 1, 30);

        printMorgage(principal, annualInterestRate, years);
        printPaymentSchedule(principal, annualInterestRate, years);
    }

    private static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE: " );
        System.out.println("------------------");
        for (int month = 0; month <= years * MONTHS_IN_YEAR; month ++){
            double balance = calculatRemainingBalance(principal, annualInterestRate, years, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    private static void printMorgage(int principal, float annualInterestRate, byte years) {
        double mortgage = calculatMortgage(principal, annualInterestRate, years);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("MONTHLY MORTGAGE: " + mortgageFormatted);
        System.out.println("------------------");
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
        short numberOfPayment = (short)(years * MONTHS_IN_YEAR);
        float monthInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthInterestRate * Math.pow(1+monthInterestRate, numberOfPayment))
                / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);
        return mortgage;
    }

    public static double calculatRemainingBalance(
            int principal,
            float annualInterestRate,
            byte years,
            int numberOfPaymentMade) {
        short numberOfPayment = (short)(years * MONTHS_IN_YEAR);
        float monthInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;
        double remaningBalance = principal
                * (Math.pow(1+monthInterestRate, numberOfPayment) - Math.pow(1+monthInterestRate, numberOfPaymentMade))
                / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);
        return remaningBalance;
    }
}

