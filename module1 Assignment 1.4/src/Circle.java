public class Circle extends TwoDShape{
    private final double PI = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = radius * radius * PI;
        return area;
    }

    @Override
    public String toString(){
        return "radius: " + radius + "Area: " + getArea() + "Type of Shape: Circle";
    }
}

