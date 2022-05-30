package com.cms.assignment.activity6;

public class Circle {

    private final double pi = 3.142; // constant
    private final double radius; // radius

    public Circle(double radius) { // constructor
        this.radius = radius;
    }

    public double Area() { // method for area
        return radius * radius * pi;
    }

    public double Diameter() { // method for diameter
        return radius * 2;
    }

    public double Circumference() { // method for circumference
        return radius * pi * 2;
    }
}
