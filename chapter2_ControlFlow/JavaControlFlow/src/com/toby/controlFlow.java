package com.toby;

public class controlFlow {
    public static void main(String[] args) {
////        Multi-condition
//        int temp = 22;
//        boolean isWarm = temp > 20 && temp < 30;
//        System.out.println(isWarm);
//
//        boolean badTemp = temp < 20 || temp > 30;
//        System.out.println(badTemp); // (cond1 || cond2) && cond3
//

//        if
        int temp = 32;
        if (temp > 30) {
            System.out.println("What a hot day.");
            System.out.println("Drink Water.");
        }
        else if (temp > 20 && temp <= 30){
            System.out.println("Beautiful day");
        }
        else {
            System.out.println("Cold day.");
        }
    }
}
