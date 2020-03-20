package classPrac;

public class Triangle {
    public Integer a,b,c;

    public Triangle(int a, int b, int c) {
        double area = (a+b+c) / 2.0;
        System.out.println(Math.pow((area * (area - a) * (area - b) * (area - c)), .5));
        System.out.println((a+b+c) / 2.0);
    }

    public void getArea() {

    }
    public void getPerimeter() {

    }
}
