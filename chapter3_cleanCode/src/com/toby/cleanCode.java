package com.toby;

public class cleanCode {
    public static void main(String[] args) {
        String message = greetUser("Toby", "Huang");
    }
    // creating methods
    public static String greetUser(String firstName, String lastName) {
        return "Hello" + firstName + " " + lastName;
    }
}
