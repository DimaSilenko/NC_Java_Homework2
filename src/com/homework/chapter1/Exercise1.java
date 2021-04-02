package com.homework.chapter1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an int: ");
        int value = in.nextInt();
        System.out.println();
        System.out.println("In binary: " + Integer.toBinaryString(value));
        System.out.println("In octal: " + Integer.toOctalString(value));
        System.out.println("In hexadecimal: " + Integer.toHexString(value));
        double reciprocal = 1.0 / value;
        System.out.println("Reciprocal in hex: " + Double.toHexString(reciprocal));
    }
}
