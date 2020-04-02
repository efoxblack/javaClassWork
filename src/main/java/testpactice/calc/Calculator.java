package testpactice.calc;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int c, int d) {
        return c - d;
    }

    public int multiply(int e, int f) {
      return e * f;
    }

    public int divide(int g, int h) {
        return g / h;
    }

    public double exponent(double i, double j) {
        return Math.pow(i, j);
    }

    public double square(int k) {
        return Math.pow(k, 2);
    }

    public double squareRoot(double l) {
        return Math.sqrt(l);
    }

    public double sineMethod (double m) {
        double degrees = m;
        double radians = Math.toRadians(degrees);
        return Math.sin(radians);
    }
}
