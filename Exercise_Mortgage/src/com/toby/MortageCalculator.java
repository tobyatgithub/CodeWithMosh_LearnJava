package com.toby;

import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your mortgage calculator. \nPlease type in the information...");

        int Principle = 0;
        while (Principle < 1000 || Principle > 1_000_000){
            Principle = scanner.nextInt()
        }
    }
}
