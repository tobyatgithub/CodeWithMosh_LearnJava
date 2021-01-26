package com.toby;

public class MortgageCalculator {
  private final static byte MONTHS_IN_YEAR = 12;
  private final static byte PERCENT = 100;

  private int principal;
  private float annualInterestRate;
  private byte years;

  public MortgageCalculator(int principal, float annualInterestRate, byte years) {
    this.principal = principal;
    this.annualInterestRate = annualInterestRate;
    this.years = years;
  }

  public double calculatRemainingBalance(int numberOfPaymentMade) {
    short numberOfPayment = getNumberOfPayments();
    float monthInterestRate = getMonthInterest();
    double remaningBalance = principal * (Math.pow(1 + monthInterestRate, numberOfPayment) - Math
        .pow(1 + monthInterestRate, numberOfPaymentMade)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return remaningBalance;
  }


  public double calculatMortgage() {
    short numberOfPayment = getNumberOfPayments();
    float monthInterestRate = getMonthInterest();

    double mortgage = principal * (monthInterestRate * Math
        .pow(1 + monthInterestRate, numberOfPayment)) / (Math
        .pow(1 + monthInterestRate, numberOfPayment) - 1);
    return mortgage;
  }

  public double[] getRemainingBalances(){
    var balances = new double[getNumberOfPayments()];
    for (int month = 0; month <= balances.length; month++) {
      balances[month - 1] = calculatRemainingBalance(month);
    }
    return balances;
  }

  private short getNumberOfPayments() {
    return (short) (years * MONTHS_IN_YEAR);
  }

  private float getMonthInterest() {
    return annualInterestRate / PERCENT / MONTHS_IN_YEAR;
  }
}
