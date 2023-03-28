package com.keita.module1;

public abstract class TwoDShape{
    private double width;
    private double height;

    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
        width = 0.0;
        height = 0.0;
    }

    public double getArea(){
        double areaOfRectangle = width * height;
        return areaOfRectangle;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}
