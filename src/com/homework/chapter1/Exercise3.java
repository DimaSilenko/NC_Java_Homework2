package com.homework.chapter1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int value1, value2, value3;
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        value1 = in.nextInt();
        int max = value1;

        System.out.print("Input second number: ");
        value2 = in.nextInt();
        if (value2 > max)
            max = value2;

        System.out.print("Input third number: ");
        value3 = in.nextInt();
        if (value3 > max)
            max = value3;
        System.out.println();
        System.out.println("Max of this numbers is: " + max);

        max = Math.max(value1, Math.max(value2, value3));
        System.out.println("The same with Math.max: " + max);

        //Другой подход, к реализации первой подзадачи
        if (value1 > value2) {
            if (value1 > value3)
                max = value1;
            else
                max = value3;
        } else {
            if (value2 > value3)
                max = value2;
            else
                max = value3;
        }
        System.out.println("Another way to first task: " + max);
    }
}
