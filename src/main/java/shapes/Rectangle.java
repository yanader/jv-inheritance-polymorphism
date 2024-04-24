package shapes;

public class Rectangle extends Shape{
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length*width;
    }
}
