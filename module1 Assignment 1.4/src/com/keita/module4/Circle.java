package com.keita.module4;

public class Circle extends TwoDShape {
    private final double PI = 3.14;
    private double radius;


    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Compute the area of circle with the given radius.
     * @return the calculated area of the circle. For example, circle(1) = 3.14.
     */
    public double getArea(){
        double area = radius * radius * PI;
        return area;
    }

    /**
     * Format of how to print the radius and the area of circle.
     * @return toString returns the information about the radius and the area of the circle.
     */
    @Override
    public String toString(){
        return String.valueOf(getArea());//"radius: " + radius + " Area: " + getArea() + " Type of shape: Circle";
    }
}


