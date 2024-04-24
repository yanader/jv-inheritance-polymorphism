package shapes;

public class Pyramid extends Shape3D {
    double height;

    public Pyramid(double height, Shape base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        return (base.calculateArea()*height)/3;
    }
}
