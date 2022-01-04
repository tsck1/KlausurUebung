package lV7_Bsp_Abstrakte_Klassen;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*3.1415;
    }

    @Override
    public double getArea() {
        return (Math.pow(radius,2))*Math.PI;
    }
}
