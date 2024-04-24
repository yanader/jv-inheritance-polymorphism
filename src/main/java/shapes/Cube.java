package shapes;

public class Cube extends Shape3D{
    double size;

    public Cube(double size) {
        this.size = size;
        this.base = new Rectangle(size, size);
    }

    private Cube(Rectangle base) {
        this.size = base.length;
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        return Math.pow(size , 3);
    }
}
