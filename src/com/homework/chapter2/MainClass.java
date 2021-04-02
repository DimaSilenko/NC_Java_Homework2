package com.homework.chapter2;

public class MainClass {
    public static void main(String[] args) {
        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("(" + p.getX() + ", " + p.getY() + ")");

        System.out.println();
        Car c = new Car(30, 0, 9.5);
        System.out.println("Fuel: " + c.getFuel() + "; Position: " + c.getCurrentPosition());
        c.drive(400);
        c.drive(300);
        System.out.println("Fuel: " + c.getFuel() + "; Position: " + c.getCurrentPosition());
    }
}
