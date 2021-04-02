package com.homework.chapter4;

public class Rectangle extends Shape implements Cloneable {
    private double width, height;

    public Rectangle(Point topLeft, double width, double height) {
        this.point = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() + height / 2);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Rectangle(point, width, height);
    }
}
