package shapes;

public class Pentagon extends Shape {
    public double edge;

    public Pentagon(double edge) {
        this.edge = edge;
    }


    @Override
    public double calculateArea() {
        return 0.25 * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))) * Math.pow(this.edge, 2);
    }
}
