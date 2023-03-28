package com.keita.module1;



public class Triangle extends TwoDShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height){
        super(width, height);
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double heronsHeight(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s-side3));
        double height = area * 2 / side2;
        return height;
    }

    public double getArea(){
        return getArea();
    }
}

