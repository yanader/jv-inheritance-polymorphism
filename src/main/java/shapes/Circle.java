package shapes;

import vehicles.Main;

public class Circle extends Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
