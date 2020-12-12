package data.shapes;

public class Triangle implements Shape {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double a, double b, double c) throws IllegalArgumentException{
        if(a >= b + c || b >= a + c || c >= a + b ||
                a <= 0 || b <= 0 || c <= 0)
            throw new IllegalArgumentException("Nonexistent triangle");
        else {
            this.side1 = a;
            this.side2 = b;
            this.side3 = c;
        }
    }

    @Override
    public double calcArea() {
        double p = calcPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public double calcPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}