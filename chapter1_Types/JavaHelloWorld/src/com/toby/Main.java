package com.toby;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        final byte MONTH_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal in dollar:");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate in % digits:");
        float annual_rate = scanner.nextFloat();
        System.out.print("Period in years:");
        byte years = scanner.nextByte();

        float monthly_rate = annual_rate/MONTH_IN_YEAR/PERCENT;
        double Money =  principal * monthly_rate * Math.pow((1+monthly_rate), years*12)/(Math.pow(1+monthly_rate, years*12) - 1);

        String currency = NumberFormat.getCurrencyInstance().format(Money);
        System.out.println(currency);

    }
}



//package com.toby;
//import javax.swing.text.NumberFormatter;
//import java.awt.*;
//import java.text.NumberFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
//
//public class Main {
////  Type class from Java course 1
//    public static void main(String[] args) {
//////        Content 1-7
////        String message = "Hello World \"Toby\"" + "!!";
////        System.out.println(message); // sout
////        System.out.println(message.endsWith("!!"));
////        System.out.println(message.indexOf("o"));
////        System.out.println(message.replace("!", "*"));
////        System.out.println(message); //string is immutable.
//////        Primitive type vs. Reference type:
//////        We use primitive type to store simple objects: byte, int, short, long, float, double, boolean
//////        We use Reference type to store complex objects, and we need to use `new` to allocate memory
//////        each time when init: e.g. Date now = new Date()
////        int age = 30;
////        Date now = new Date();
////	    System.out.println(now);
////
////        Point point1 = new Point(1, 1);
////        Point point2 = point1;
////        point1.x = 2;
////        System.out.println(point2);
//////        Primitive type are copied by value, which are independent
//////        Reference type are copied by reference, which are dependent.
////
//////        Arrays!
////        int[] numbers = new int[5];
////        numbers[0] = 10;
////        numbers[3] = 2;
////        System.out.println(Arrays.toString(numbers));
////
////        int[] Newnumbers = {2,3,5,1,4};
////        System.out.println(Newnumbers.length);
////
////        int [][] matrix = new int[2][3];
////        matrix[0][0] = 1;
////        System.out.println(Arrays.deepToString(matrix));
////
////        int [][] newMatrix = { {1,2,3}, {4,5,6}};
////        System.out.println(Arrays.deepToString(newMatrix));
////
//////        Constant!
////        final float PI = 3.14F;
//
//////        Arithmetic
////        int result = 10 / 3;
////        System.out.println(result);       // gives you 3
////
////        double result = (double)10 / (double)3;
////        System.out.println(result);     // gives you 3.33333...
////
////        int x = 1;
////        int y = x++; // assign y = x, then x ++
////        x = 1;
////        int z = ++x; // x ++ first, then assign z = x
////        System.out.println(x);
////        System.out.println(y);
////        System.out.println(z);
//
//////        Compatible casting types:
//////        byte > short > int > long > float > double
////        double x = 1.1;
////        double y = x + 1;
////        double z = (int)x + 1.1;
////        System.out.println(y);
//
////        String x = "1";  // string to int/flot/double: int.parse, short.parseshort, etc.
////        int y = Integer.parseInt(x) + 2;
////        System.out.println(y);
//
//
//////        The Math class
////        int result = Math.round(1.1F);
////        System.out.println(result);
////
////        double result2 = Math.ceil(1.1F); // default return a double
////        System.out.println(result2);
//
//
//////        15. Formatting Numbers
////        String currency = NumberFormat.getCurrencyInstance().format(23112431.21312);
////        System.out.println(currency);
////
////        NumberFormat percent = NumberFormat.getPercentInstance(); // use short cut to rename!!
////        String result = percent.format(0.1); // right click -> refactor or shift+F6
////        System.out.println(result);
//
////        Reading input
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("What is your name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);
//    }
//}
//
