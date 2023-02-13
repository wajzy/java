package shape;

public class Rectangle extends Square {
    protected final double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2.;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
