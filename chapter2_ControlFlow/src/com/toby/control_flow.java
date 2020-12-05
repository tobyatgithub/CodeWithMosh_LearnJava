package com.toby;

public class control_flow {
    static void if_statment() {
        System.out.println("#4 if statment");
        int temp = 32;
        if (temp > 30){
            System.out.println("It's a hot day.");
            System.out.println("Drink water");
        }
        else if (temp > 20 && temp <=30) { //ps: this temp <= 30 is not necessary
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day");
        }
        System.out.println();
    }

    static void simplify_if() {
        System.out.println("#5 simplify if statment");
        int income = 120_000; // _ to make it more readable
        boolean hasHighIncome1 = false;
        if (income > 100_000)
            hasHighIncome1 = true;
        System.out.println(hasHighIncome1);
        // OR
        boolean hasHighIncome2 = (income > 100_000);
        System.out.println(hasHighIncome2);
        System.out.println();
    }

    static void TernaryOperator() {
        System.out.println("#6 Ternary Operator");
        int income = 120_000; // _ to make it more readable
//        String className = "Economy";
//        if (income > 100_000)
//            className = "First";
        String className = income > 100_000 ? "First" : "Economy"; // true : false
        System.out.println(className);
        System.out.println();
    }

    public static void main(String[] args) {
        // 4.
        if_statment();
        // 5.
        simplify_if();
        // 6.
        TernaryOperator();
    }
}
