import shape.Rectangle;
import shape.Square;

public class Application {
    public static void main(String[] args) {
        Square s = new Square(2.);
        System.out.println("Square, side length: " + s.getA()
                + ", perimeter: " + s.getPerimeter() + ", area: " + s.getArea());
        Rectangle r = new Rectangle(1., 2.);
        System.out.println("Rectangle, 'a' side length: " + r.getA() + ", 'b' side length: " + r.getB()
                + ", perimeter: " + r.getPerimeter() + ", area: " + r.getArea());
    }
}
