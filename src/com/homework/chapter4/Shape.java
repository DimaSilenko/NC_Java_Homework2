package com.homework.chapter4;

public abstract class Shape {
    protected Point point;

    public Shape() {
    }

    public void moveBy(double dx, double dy) {
        point.setXY(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();
}
