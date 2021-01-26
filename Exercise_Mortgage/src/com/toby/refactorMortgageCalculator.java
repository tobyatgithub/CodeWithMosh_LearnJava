package com.toby;

public class refactorMortgageCalculator {

    public static void main(String[] args) {
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");
        int principal = (int) Console.readNumber("Principal: ", 1_000, 1_000_000);
        float annualInterestRate = (float) Console.readNumber("Annual Interest Rate: ", 0, 30);
        byte years = (byte) Console.readNumber("Period (years): ", 1, 30);

        var calculator = new MortgageCalculator(principal, annualInterestRate, years);
        var report = new MortgageReport(calculator);
        report.printMorgage();
        report.printPaymentSchedule();
    }

}

