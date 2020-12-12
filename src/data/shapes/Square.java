package data.shapes;

public class Square implements Shape {
    private final double side;

    public Square(double a) throws IllegalArgumentException {
        if(a <= 0)
            throw new IllegalArgumentException("Side must be positive");
        else
            this.side = a;
    }

    @Override
    public double calcArea() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double calcPerimeter() {
        return 4 * this.side;
    }
}