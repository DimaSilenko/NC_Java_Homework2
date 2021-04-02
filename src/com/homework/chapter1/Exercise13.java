package com.homework.chapter1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Exercise13 {
    public static void main(String[] args) {
        ArrayList<Integer> lottery = new ArrayList<Integer>(49);
        for (int i = 1; i < 50; i++)
            lottery.add(i);
        int[] chosen = new int[6];
        for (int i = 0; i < 6; i++) {
            int rand = (int) (Math.random() * lottery.size());
            chosen[i] = lottery.get(rand);
            lottery.remove(rand);
        }
        Arrays.sort(chosen);
        for (int i = 0; i < chosen.length; i++)
            System.out.println("Winning number is: " + chosen[i]);

    }
}
