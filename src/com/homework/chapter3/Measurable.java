package com.homework.chapter3;

public interface Measurable {
    double getMeasurable();

    double average(Measurable[] objects);

    Measurable largest(Measurable[] objects);
}
