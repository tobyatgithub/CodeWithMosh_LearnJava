package com.toby;

import java.text.NumberFormat;

public class MortgageReport {

  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE: ");
    System.out.println("------------------");
    for (int month = 0; month <= calculator.getYears() * MortgageCalculator.MONTHS_IN_YEAR; month++) {
      double balance = calculator.calculatRemainingBalance(month);
      System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
  }

  public void printMorgage() {
    double mortgage = calculator.calculatMortgage();
    String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
    System.out.println("MONTHLY MORTGAGE: " + mortgageFormatted);
    System.out.println("------------------");
  }
}
