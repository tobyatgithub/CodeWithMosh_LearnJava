package com.toby;

import java.util.Scanner;

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

    static void SwitchStatement() {
        System.out.println("#7 switch statment");
        String role = "admin";

        switch (role) {
            case "admin":
                System.out.println("You're an admin");
                break;
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default:
                System.out.println("You're a guest");
        }
//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role == "moderator")
//            System.out.println("You're a moderator");
//        else
//            System.out.println("You're a guest");
        System.out.println();
    }

    static void exercise_fizzbuzz(){
        System.out.println("Exercise: fizzbuzz");
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter number: ");

        int Number = myScanner.nextInt();
        if (Number%3==0 && Number%5==0)
            System.out.println("FizzBuzz");
        else if (Number%3==0)
            System.out.println("Fizz");
        else if (Number%5==0)
            System.out.println("Buzz");
        else
            System.out.println(Number);
        System.out.println();

    }

    static void for_loop() {
        System.out.println("#9, for loop");
        for (int i = 0; i < 5; i++){
            System.out.println("Hello World " + i);
        }

    }

    static void while_loop() {
        String input = "";
        // input != "quit" will not work as it will compare their physical address
        Scanner scanner = new Scanner(System.in);
        while (!input.toLowerCase().trim().equals("quit")){
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println("You typed in: " + input);
        }
    }

    static void break_and_continue() {
        String input = "";
        // input != "quit" will not work as it will compare their physical address
        Scanner scanner = new Scanner(System.in);
//        while (!input.toLowerCase().trim().equals("quit")){
        while (true) { // advantage of using break.
            System.out.print("Input: ");
            input = scanner.next();
            if (input.toLowerCase().trim().equals("pass"))
                continue; // skip the print if typed in pass but stay in the loop
            if (input.toLowerCase().trim().equals("quit"))
                break; //skip the print if quit
            System.out.println("You typed in: " + input);
        }
    }

    static void for_each_loop() {
        String[] fruits= {"Apple", "Mango", "Orange"};

//        for (int i = 0; i < fruits.length; i++)
//            System.out.println(fruits[i]);

        for (String fruit : fruits) //for-each
            System.out.println(fruit);

    }
    public static void main(String[] args) {
        // 4.
//        if_statment();
        // 5.
//        simplify_if();
        // 6.
//        TernaryOperator();
        //7.
//        SwitchStatement();
        //8.
//        exercise_fizzbuzz();
        //9.
//        for_loop();
        // 10.
//        while_loop();
        // comment: use for loop if you know how many times you want the code to run
        //          use while loop if you don't know how many times your code will run.
        // 11.
//        break_and_continue();
        // 12. limit1: forward only, can do i-- style; limit2: won't have access to index
//        for_each_loop();
    }


}
