package com.cms.assignment.activity6;

public class Implementation {

    public static void main(String[] args) {
        System.out.println("Creating new instances of Rectangle, Triangle, Circle and Square, " +
                "giving them names and print the returned values of their methods\n");

        double radius = 25.0;
        double height = 13.0;
        double width = 9.0;

        Rectangle rectangle = new Rectangle(height, width); // Object of Rectangle class
        double areaRectangle = rectangle.Area(); // area function for Rectangle class

        Triangle triangle = new Triangle(height, width); // Object of Triangle class
        double areaTriangle = triangle.Area(); // area function for Triangle class

        Circle circle = new Circle(radius); // Object of Circle class
        double areaCircle = circle.Area(); // area function for Circle class
        double diameterCircle = circle.Diameter(); // diameter function for Circle class
        double circumferenceCircle = circle.Circumference(); // circumference function for Circle class

        Square square = new Square(height); // Object of Square class
        double areaSquare = square.Area(); // area function for Square class

        // Results
        System.out.println("Area of the Rectangle is: " + areaRectangle);
        System.out.println("Area of the Triangle is: " + areaTriangle);
        System.out.println("Area of the Circle is: " + areaCircle);
        System.out.println("Diameter of the Circle is: " + diameterCircle);
        System.out.println("Circumference of the Circle is: " + circumferenceCircle);
        System.out.println("Area of the Square is: " + areaSquare);
    }
}
