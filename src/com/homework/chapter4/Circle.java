package com.homework.chapter4;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point center, double radius) {
        this.point = center;
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Circle(point, radius);
    }
}
