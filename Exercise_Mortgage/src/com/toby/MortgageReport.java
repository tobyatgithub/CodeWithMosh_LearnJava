package com.toby;

import java.text.NumberFormat;

public class MortgageReport {

  private final NumberFormat currency;
  private MortgageCalculator calculator;

  public MortgageReport(MortgageCalculator calculator) {
    this.calculator = calculator;
    currency = NumberFormat.getCurrencyInstance();
  }

  public void printPaymentSchedule() {
    System.out.println();
    System.out.println("PAYMENT SCHEDULE: ");
    System.out.println("------------------");
    for (double balance: calculator.getRemainingBalances()){
      System.out.println(currency.format(balance));
    }
  }

  public void printMorgage() {
    double mortgage = calculator.calculatMortgage();
    String mortgageFormatted = currency.format(mortgage);
    System.out.println("MONTHLY MORTGAGE: " + mortgageFormatted);
    System.out.println("------------------");
  }
}
