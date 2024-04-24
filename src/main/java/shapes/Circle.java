package shapes;

import vehicles.Main;

public class Circle extends Shape{
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }
}
