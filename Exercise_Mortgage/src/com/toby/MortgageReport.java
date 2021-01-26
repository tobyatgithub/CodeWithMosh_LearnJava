package com.toby;

import java.text.NumberFormat;

public class MortgageReport {
  public static void printPaymentSchedule(int principal, float annualInterestRate, byte years) {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE: ");
    System.out.println("------------------");
    for (int month = 0; month <= years * refactorMortgageCalculator.MONTHS_IN_YEAR; month++) {
      double balance = refactorMortgageCalculator
          .calculatRemainingBalance(principal, annualInterestRate, years, month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public static void printMorgage(int principal, float annualInterestRate, byte years) {
    double mortgage = refactorMortgageCalculator
        .calculatMortgage(principal, annualInterestRate, years);
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("MONTHLY MORTGAGE: " + mortgageFormatted);
    System.out.println("------------------");
  }
}
