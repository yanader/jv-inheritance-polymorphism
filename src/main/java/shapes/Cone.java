package shapes;

public class Cone extends Shape3D{
    double height;

    public Cone(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    @Override
    protected double calculateVolume() {
        return (base.calculateArea()*height)/3;
    }
}
