package shapes;

public class Prism extends Shape3D{
    double height;

    public Prism(double height, Shape base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        return base.calculateArea()*height;
    }
}
