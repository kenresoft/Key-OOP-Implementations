package com.cms.assignment.activity6;

public class Triangle {

    private final double height; // height
    private final double width; // width

    public Triangle(double height, double width) { // constructor
        this.height = height;
        this.width = width;
    }

    public double Area() { // method
        return height * (width / 2);
    }
}
