package hw_2;

import static java.lang.Math.*;
import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class AreaTest {
    @Test
    public void areaCircle() {
        double r = random() * 100 + 0.1;
        Circle circle = new Circle(r);
        assertEquals(PI * r * r, circle.area(), pow(0.1, 10));
    }

    @Test
    public void areaSquare() {
        double a = random() * 100 + 0.1;
        Square square = new Square(a);
        assertEquals(a * a, square.area(), pow(0.1, 10));
    }

    @Test
    public void areaRectangle() {
        double a = random() * 100 + 0.1;
        double b = random() * 100 + 0.1;
        Rectangle rectangle = new Rectangle(a,b);
        assertEquals(a * b, rectangle.area(), pow(0.1, 10));
    }

    @Test
    public void circleIllegalArgumentsExpectation() throws IllegalArgumentException{
        try {
            Circle circle = new Circle(0);
            Assert.fail("Expected IllegalArgumentsExpectation");
        }catch (IllegalArgumentException thrown){}
    }

    @Test
    public void squareIllegalArgumentsExpectation() throws IllegalArgumentException{
        try {
            Square square = new Square(-1);
            Assert.fail("Expected IllegalArgumentsExpectation");
        }catch (IllegalArgumentException thrown){}


    }

    @Test
    public void rectangleIllegalArgumentsExpectation() throws IllegalArgumentException{
        try {
            Rectangle rectangle = new Rectangle(0, -1);
            Assert.fail("Expected IllegalArgumentsExpectation");
        }catch (IllegalArgumentException thrown){}


    }
}