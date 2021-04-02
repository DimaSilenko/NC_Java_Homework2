package com.homework.chapter1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an int angle: ");
        int value = in.nextInt();
        System.out.println();

        int angleNormalized = value % 360;
        if (value < 0)
            angleNormalized += 360;
        System.out.println("%: " + angleNormalized);
        System.out.println("floorMod: " + Math.floorMod(value, 360));
    }
}
