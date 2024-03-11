package com.circle.application.circle;

public class Circle {

    private double radius;

    private static final double PI = 3.1416;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference(){
        return 2 * PI * radius;
    }

}
