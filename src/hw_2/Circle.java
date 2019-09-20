package hw_2;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private final double r; // радиус круга

    public Circle(double r) throws IllegalArgumentException {
        if (r <= 0) {
            throw new IllegalArgumentException("r is negative or zero, r =" + r);
        } else {
            this.r = r;
        }
    }

    @Override
    public double area() {
        return PI * r * r;
    }
}
