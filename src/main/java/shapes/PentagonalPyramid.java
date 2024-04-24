package shapes;

public class PentagonalPyramid extends Shape3D{
    double height;

    public PentagonalPyramid(Shape base, double height) {
        this.height = height;
        this.base = base;
    }


    @Override
    protected double calculateVolume() {
        return 1.0 / 3.0 * base.calculateArea() * height;
    }
}
