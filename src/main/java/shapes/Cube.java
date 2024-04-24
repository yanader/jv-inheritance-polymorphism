package shapes;

public class Cube extends Shape3D{
    double size;

    public Cube(double size) {
        this(size, new Rectangle(size, size));
    }

    private Cube(double size, Rectangle base) {
        this.size = size;
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        return Math.pow(size , 3);
    }
}
