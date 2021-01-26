package com.toby;

public class Main {
    public static void main(String[] args) {
        // Here we can use var or TextBox to declare this new variable
        // var is cleaner and java will seek the type automatically
        // (ps by using var, textBox1 is set to TextBox class and can't be
        // changed into other type such as int/float/string etc.)
        var textBox1 = new TextBox();
        textBox1.setText("Box 1");
        System.out.println(textBox1.text);

        var employee = new Employee(
                50_000, 20);
//        System.out.println(Employee.numberOfEmployees);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage(20);
        System.out.println(wage);

        // Abstraction = reduce complexity by hiding unnecessary details
        // i.e. hide implementation details and treat it as a black box.
        var browser = new Browser();
        browser.navigate("");

        double T = 24;
        double S = 22;
        System.out.println("T = " + T + "S = " + S);
    }
}
