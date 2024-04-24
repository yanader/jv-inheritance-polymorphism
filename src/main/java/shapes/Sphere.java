package shapes;

public class Sphere extends Shape3D {

    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        Circle c = (Circle)base;
        double r = c.getRadius();
        return Math.pow(r, 3) * Math.PI * 4 / 3;
    }
}
