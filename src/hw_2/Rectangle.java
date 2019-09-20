package hw_2;

public class Rectangle implements Shape {
    private final double a, b; // стороны прямоугольника

    public Rectangle(double a, double b) throws IllegalArgumentException {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a or b is negative or zero, a =" + a + " b =" + b);
        } else {
            this.a = a;
            this.b = b;
        }
    }

    @Override
    public double area() {
        return a * b;
    }
}
