package com.keita.module4;


public abstract class TwoDShape{
    private double width;
    private double height;
    private Color color;


    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public TwoDShape(){
        width = 0.0;
        height = 0.0;
        color = Color.NONE;
    }

    /**
     * This is implemented in Triangle and Circle classes.
     * @return the area calculated in each Circle and Triangle classes.
     */
    public abstract double getArea();

    /**
     * setting the width
     * @param width is the width that is determined by user
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * get the numerical value of width
     * @return the width.
     */
    public double getWidth() {
        return width;
    }


    /**
     * get the numerical value of height
     * @return the height.
     */
    public double getHeight() {
        return height;
    }

    /**
     * set the height
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }


}


