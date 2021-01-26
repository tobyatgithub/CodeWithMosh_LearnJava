package com.toby;

public class MortgageCalculator {
  private int principal;
  private float annualInterestRate;
  private byte years;

  public MortgageCalculator(int principal, float annualInterestRate, byte years) {
    this.principal = principal;
    this.annualInterestRate = annualInterestRate;
    this.years = years;
  }

  public double calculatRemainingBalance(int numberOfPaymentMade) {
    short numberOfPayment = (short) (years * refactorMortgageCalculator.MONTHS_IN_YEAR);
    float monthInterestRate = annualInterestRate / refactorMortgageCalculator.PERCENT / refactorMortgageCalculator.MONTHS_IN_YEAR;
    double remaningBalance = principal * (Math.pow(1 + monthInterestRate, numberOfPayment) - Math
        .pow(1 + monthInterestRate, numberOfPaymentMade)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return remaningBalance;
  }

  public double calculatMortgage() {
    short numberOfPayment = (short) (years * refactorMortgageCalculator.MONTHS_IN_YEAR);
    float monthInterestRate = annualInterestRate / refactorMortgageCalculator.PERCENT / refactorMortgageCalculator.MONTHS_IN_YEAR;

    double mortgage = principal * (monthInterestRate * Math
        .pow(1 + monthInterestRate, numberOfPayment)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return mortgage;
  }

  public byte getYears() {
    return years;
  }
}
