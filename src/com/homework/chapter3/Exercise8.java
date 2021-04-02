package com.homework.chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Exercise8 {
    public void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (true) {
            boolean needSort = false;
            for (int i = 0; i < strings.size() - 1; i++) {
                if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                    needSort = true;
                    break;
                }
            }
            if (needSort)
                Collections.shuffle(strings);
            else
                break;
        }
    }
}
