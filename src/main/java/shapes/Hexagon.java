package shapes;

public class Hexagon extends Shape{
    public double edge;

    public Hexagon(double edge) {
        this.edge = edge;
    }

    @Override
    public double calculateArea() {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(this.edge, 2);
    }
}
