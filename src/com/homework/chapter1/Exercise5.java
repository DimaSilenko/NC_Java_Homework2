package com.homework.chapter1;

public class Exercise5 {
    public static void main(String[] args) {
        double a = 2.0e12;
        System.out.println("Double value is: " + a);
        int b = (int) a;
        System.out.println("Downcast to int: " + b);
        System.out.println("This is because max value of int: " + Integer.MAX_VALUE);
    }
}
