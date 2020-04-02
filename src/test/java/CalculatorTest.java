import org.junit.*;
import testpactice.calc.Calculator;

public class CalculatorTest {

    @Test
    public void addTest() {
        // Given
        Calculator calculator = new Calculator();
        int x = 1;
        int y = 2;
        int expected = 3;
        //When
        int actual = calculator.add(x, y);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractTest() {
        //Given
        Calculator calculator = new Calculator();
        int x = 6;
        int y = 3;
        int expected = 3;
        //When
        int actual = calculator.subtract(x, y);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplyTest() {
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 3;
        int expected = 9;

        int actual = calculator.multiply(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divideTest() {
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 2;
        int expected = 5;

        int actual = calculator.divide(x, y);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void exponentTest() {
        Calculator calculator = new Calculator();
        int x = 3;
        int y = 4;
        int expected = 81;

        double actual = calculator.exponent(x, y);

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareTest() {
        // Given
        Calculator calculator = new Calculator();
        int x = 5;

        int expected = 25;
        // When
        double actual = calculator.square(5);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void squareRootTest() {
        // Given
        Calculator calculator = new Calculator();
        double x = 16;

        double expected = 4;
        // When
        double actual = calculator.squareRoot(x);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void sineMethodTest() {
        // Given
        Calculator calculator = new Calculator();
        double x = 45.0;

        double expected = 0.7071067811865475;
        // When
        double actual = calculator.sineMethod(x);
        // Then
        Assert.assertEquals(expected, actual, 0);
    }
}
