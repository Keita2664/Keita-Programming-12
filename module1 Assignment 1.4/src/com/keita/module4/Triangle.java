package com.keita.module4;

public class Triangle extends TwoDShape implements Rotate {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height){
        super(width, height);
    }


    public Triangle(double side1, double side2, double side3){
        super(side2, 1);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight(side1,side2,side3));
    }


    /**
     * Compute herons height.
     * @param side1 one side of the triangle; side1 > 0.
     * @param side2 one side of the triangle that is used as base; side2 > 0.
     * @param side3 one side of the triangle; side3 > 0.
     * @return returns the height of the triangle based on the calculation.
     */
    public double heronsHeight(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s-side3));
        double height = area * 2 / side2;
        return height;
    }

    /**
     * Calculate the area of triangle.
     * @return returns the calculated value. For example, triangle(width = 1 and height = 2) = 1.
     */
    public double getArea(){
        double area = getWidth() * getHeight() / 2;
        return area;
    }

    /**
     * Format of how to print the height and the area of triangle.
     * @return toString returns height and area of triangles.
     */
    @Override
    public String toString(){
        return "height: " + side1 + "Area: " + getArea() +  " Type of Shape: Triangle.";
    }

    @Override
    public void rotate90() {
        return;
    }

    @Override
    public void rotate180() {
        return;
    }

    @Override
    public void rotate(double degree) {
        return;
    }
}
