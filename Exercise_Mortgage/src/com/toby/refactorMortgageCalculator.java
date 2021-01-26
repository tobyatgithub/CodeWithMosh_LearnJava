package com.toby;

public class refactorMortgageCalculator {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");
        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) Console.readNumber("Period (years): ", 1, 30);

        MortgageReport.printMorgage(principal, annualInterestRate, years);
        MortgageReport.printPaymentSchedule(principal, annualInterestRate, years);
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

