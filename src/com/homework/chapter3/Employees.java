package com.homework.chapter3;

import java.lang.reflect.Array;

public class Employees implements Measurable {
    private String firstName, lastName;
    private int salary;

    public Employees(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public double getMeasurable() {
        return salary;
    }

    @Override
    public double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable object : objects) {
            sum += object.getMeasurable();
        }
        return sum / objects.length;
    }

    @Override
    public Measurable largest(Measurable[] objects) {
        int indMax = 0;
        for (int i = 1; i < objects.length; i++) {
            if (objects[i].getMeasurable() > objects[indMax].getMeasurable())
                indMax = i;
        }
        return objects[indMax];
    }

    public static void main(String[] args) {
        Employees[] employees = new Employees[5];
        employees[0] = new Employees("Jack", "Sparrow", 42000);
        employees[1] = new Employees("Hector", "Barbossa", 37000);
        employees[2] = new Employees("Davy", "Jones", 41350);
        employees[3] = new Employees("Elizabeth", "Swann", 34240);
        employees[4] = new Employees("James", "Norrington", 1750);
        System.out.println("Average salary: " + employees[0].average(employees));
        Employees largest = (Employees) employees[0].largest(employees);
        System.out.println("Hero with the largest salary is: " + largest.getName());
    }
}
