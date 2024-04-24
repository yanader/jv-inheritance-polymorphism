package shapes;

public class Football extends Shape3D{
    Shape hexagon;
    Shape pentagon;
    double edge;

    public Football(double edge) {
        this(edge, new Hexagon(edge), new Pentagon(edge));
    }

    private Football(double edge, Hexagon hexagon, Pentagon pentagon) {
        this.edge = edge;
        this.hexagon = hexagon;
        this.pentagon = pentagon;
    }

    @Override
    protected double calculateVolume() {
        return (20 * pyramidVolume(6)) + (12 * pyramidVolume(5));
    }

    public double calculateArea() {
        return 20 * this.hexagon.calculateArea() +
                12 * this.pentagon.calculateArea();
    }

    private double pyramidVolume(int numSides) {
        double height = this.edge * Math.tan(Math.toRadians(180.0 / numSides)) / 2.0;
        double baseArea = (numSides * Math.pow(this.edge, 2)) / (4.0 * Math.tan(Math.toRadians(180.0 / numSides)));
        return (1.0 / 3.0) * baseArea * height;
    }
}
