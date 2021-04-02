package com.homework.chapter2;

public class Car {
    private double fuel;
    private double currentPosition;
    private double consumption;

    public Car() {
        fuel = 50;
        currentPosition = 0.0;
        //В условии не очень понятен момент с расходом топлива, поэтову я взял старославянские литры на 100 км
        consumption = 9.5;
    }

    public Car(double fuel, double currentPosition, double consumption) {
        this.fuel = fuel;
        this.currentPosition = currentPosition;
        this.consumption = consumption;
    }

    public void drive(double miles) {
        if (miles * (consumption / 100) > fuel)
            System.out.println("Not enough fuel");
        else {
            currentPosition += miles;
            fuel -= miles * (consumption / 100);
        }
    }

    public void refueling(double fuel) {
        this.fuel += fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public double getCurrentPosition() {
        return currentPosition;
    }
}
