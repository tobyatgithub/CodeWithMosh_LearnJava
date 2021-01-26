package com.toby;

public class Employee {
    // ?why private
    private int baseSalary;
    private int hourlyRate;

    // static method (belong to class) vs. instance method (belong to object)
    // We use static method when the field belong to the whole class, e.g.:
    public static int numberOfEmployees;
    // number of total employees doesn't belong to a single employee instance
    // we call it by calling class_name.name_of_the_static_field (Employee.numberOfEmployees)

    // Constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    // Constructor overload
    public Employee(int baseSalary){
        this(baseSalary, 0);
    }

    // static function. Notice it can only see other static things.
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    // Function overload: where we can change
    // the logic of a function based on input.
    public int calculateWage(){
        return baseSalary;
        // or, return calculateWage(0);
    }

    // setter
    public void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    // getter
    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
