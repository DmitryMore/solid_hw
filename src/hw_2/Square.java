package hw_2;

public class Square implements Shape {
    private double a; // длина стороны квадрата

    public Square(double a) {
        if (a <= 0) {
            throw new IllegalArgumentException("a is negative or zero, r =" + a);
        } else {
            this.a = a;
        }
    }

    public Square(){
        this.a = 1;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double area() {
        return a * a;
    }

}
