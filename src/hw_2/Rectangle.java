package hw_2;

public class Rectangle implements Shape {
    private double a, b; // стороны прямоугольника

    public Rectangle(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("a or b is negative or zero, a =" + a + " b =" + b);
        } else {
            this.a = a;
            this.b = b;
        }
    }

    public Rectangle(){
        this.a = 1;
        this.b = 1;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double area() {
        return a * b;
    }
}
