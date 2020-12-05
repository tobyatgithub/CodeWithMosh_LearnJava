package com.toby;

import java.util.Scanner;

public class Mortgage {
    public static void calculate(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal in dollar:");
        Float principal = scanner.nextFloat();
        System.out.println("Annual Interest Rate in % digits:");
        Float annual_rate = scanner.nextFloat();
        System.out.println("Period in years:");
        short years = scanner.nextByte();

        Float monthly_rate = annual_rate/12/100;
        double Money =  principal * Math.pow((1+monthly_rate), years*12)/(Math.pow(1+monthly_rate, years*12) - 1);
        System.out.println(Money);
    }
}

