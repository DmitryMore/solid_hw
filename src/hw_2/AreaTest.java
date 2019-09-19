package hw_2;

import static java.lang.Math.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class AreaTest {
    @Test
    void areaCircle() {
        double r = random() * 100;
        Circle circle = new Circle(r);
        assertEquals(PI * r * r, circle.area(), pow(0.1, 10));
    }

    @Test
    void areaSquare() {
        double a = random() * 100;
        Square square = new Square(a);
        assertEquals(a * a, square.area(), pow(0.1, 10));
    }

    @Test
    void areaRectangle() {
        double a = random() * 100;
        double b = random() * 100;
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(a * b, rectangle.area(), pow(0.1, 10));
    }
}