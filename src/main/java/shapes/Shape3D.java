package shapes;

public abstract class Shape3D {
    protected Shape base;

    protected abstract double calculateVolume();

    public Shape getBase() {
        return base;
    }
}
