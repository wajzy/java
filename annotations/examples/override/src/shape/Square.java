package shape;

public class Square {
    protected final double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double getPerimeter() {
        return 4. * a;
    }

//    @Override
//    .../annotations/examples/override/src/shape/Square.java:18:5
//    java: method does not override or implement a method from a supertype
    public double getArea() {
        return a * a;
    }
}
