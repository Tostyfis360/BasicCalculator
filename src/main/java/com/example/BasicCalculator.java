package com.example;

import java.util.Scanner;

//This a comment to simulate collaboration. Hello from github.com!!

public class BasicCalculator {
    public static void main(String[] args) {
        
        double numer1 = 3.6;

        double numer2 = 4;
        
        System.out.println("Hello, this is the add operation!");
        
        double resAdd = add(numer1, numer2);

        System.out.println("Operation: " + numer1 + " + " + numer2 + " = " + resAdd);

        System.out.println("Hello, this is the subtract operation!");
        
        double resSubtract = subtract(numer1, numer2);

        System.out.println("Operation: " + numer1 + " - " + numer2 + " = " + resSubtract);

        System.out.println("Hello, this is the multiply operation!");

        double resMultiply = multiply(numer1, numer2);

        System.out.println("Operation: " + numer1 + " * " + numer2 + " = " + resMultiply);

        System.out.println("Hello, this is the divide operation!");

        double resDivide = divide(numer1, numer2);

        System.out.println("Operation: " + numer1 + " / " + numer2 + " = " + resDivide);
    
    }

    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a*b;
    }

    public static double divide(double a, double b) {
        return a/b;
    }
}
