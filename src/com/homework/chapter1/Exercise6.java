package com.homework.chapter1;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercise6 {
    public static BigInteger calculateFactorial(int value) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 2; i <= value; i++)
            factorial = factorial.multiply(BigInteger.valueOf(i));
        return factorial;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input number: ");
        int value = in.nextInt();
        System.out.println("Factorial of your value: " + calculateFactorial(value).toString());
    }
}
