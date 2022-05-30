package com.cms.assignment.activity6;

public class Square extends Rectangle {

    private final double height; // height

    public Square(double height) { // constructor
        super(height, height);
        this.height = height;
    }

    public double Area() { // overridden method
        return height * height;
    }
}
