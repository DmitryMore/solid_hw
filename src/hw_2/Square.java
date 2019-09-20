package hw_2;

public class Square implements Shape {
    private final double a; // длина стороны квадрата

    public Square(double a) throws IllegalArgumentException {
        if (a <= 0) {
            throw new IllegalArgumentException("a is negative or zero, r =" + a);
        } else {
            this.a = a;
        }
    }

    @Override
    public double area() {
        return a * a;
    }

}
