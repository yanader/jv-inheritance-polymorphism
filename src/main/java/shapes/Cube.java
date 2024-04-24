package shapes;

public class Cube extends Shape3D{
    double size;

    public Cube(double size) {
        this.size = size;
        new Cube(new Rectangle(size, size));
    }

    private Cube(Rectangle base) {

    }
}
