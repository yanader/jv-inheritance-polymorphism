package shapes;

public class HexagonalPyramid extends Shape3D{
    double height;

    public HexagonalPyramid(Shape base, double height) {
        this.height = height;
        this.base = base;
    }


    @Override
    protected double calculateVolume() {
        return 1.0 / 3.0 * base.calculateArea() * this.height;
    }
}
