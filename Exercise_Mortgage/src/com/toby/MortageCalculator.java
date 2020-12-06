package com.toby;

import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");

        System.out.print("Principal ($1K - $1M): ");
        int Principal = scanner.nextInt();
        while (Principal < 1000 || Principal > 1_000_000){
            System.out.println("Enter a number between 1,000 and 1,000,000.");
            System.out.print("Principal ($1K - $1M): ");
            Principal = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate (0-30) in percentage: ");
        float annualInterest = scanner.nextFloat();
        while (annualInterest<0 || annualInterest>30){
            System.out.println("Enter a value between 0 and 30");
            System.out.print("Annual Interest Rate (0-30) in percentage: ");
            annualInterest = scanner.nextFloat();
        }

        System.out.print("Period (Years): ");
        int Years = scanner.nextInt();
        while (Years < 1 || Years > 30){
            System.out.println("Enter a value between 1 and 30");
            System.out.print("Period (Years): ");
            Years = scanner.nextInt();
        }
    }
}
