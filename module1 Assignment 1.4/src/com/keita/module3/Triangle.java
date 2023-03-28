package com.keita.module3;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height){
        super(width, height);
    }

    public Triangle(double side1, double side2, double side3){
        super(side1, 0);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight(side1,side2,side3));
    }
    public double heronsHeight(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s-side3));
        double height = area * 2 / side2;
        return height;
    }

    public double getArea(){
        double area = getWidth() * getHeight() / 2;
        return area;
    }

    @Override
    public String toString(){
        return "height: " + side1 + "Area: " + getArea() +  " Type of Shape: Triangle.";
    }

    @Override
    public double rotate90() {
        return 0;
    }

    @Override
    public double rotate180() {
        return 0;
    }

    @Override
    public double rotate(double doubleDegree) {
        return doubleDegree;
    }
}
