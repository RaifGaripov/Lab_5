package data.shapes;

public class Rectangle implements Shape {
    private final double side1;
    private final double side2;

    public Rectangle(double a, double b) throws IllegalArgumentException {
        if(a <= 0 || b <= 0)
            throw new IllegalArgumentException("Length and width must be positive");
        else {
            this.side1 = a;
            this.side2 = b;
        }
    }

    @Override
    public double calcArea() {
        return this.side1 * this.side2;
    }

    @Override
    public double calcPerimeter() {
        return (this.side1 + this.side2) * 2;
    }
}