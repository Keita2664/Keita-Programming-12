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

    public abstract double getArea();

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


}


