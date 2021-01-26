package com.toby;

import java.util.Scanner;

public class Mortgage {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    private int principal;
    private float annualInterestRate;
    private byte years;
    private double mortgage;

    public Mortgage(){
        setPrincipal();
        setAnnualInterestRate();
        setYears();
        System.out.println("Mortgage info collection completed!");
    }

    private void calculateMortgage(){
        short numberOfPayment = (short)(years * MONTHS_IN_YEAR);
        float monthInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        mortgage = principal
                * (monthInterestRate * Math.pow(1+monthInterestRate, numberOfPayment))
                / (Math.pow(1+monthInterestRate, numberOfPayment) - 1);
//        return mortgage;
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

    public void setPrincipal(){
        principal = (int)readNumber("Principal: ", 1_000, 1_000_000);
    }

    public void setAnnualInterestRate(){
        annualInterestRate = (float)readNumber("Annual Interest Rate: ", 0, 30);
    }

    public void setYears(){
        years = (byte)readNumber("Period (years): ", 1, 30);
    }
}
