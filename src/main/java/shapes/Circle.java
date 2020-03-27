package shapes;

public class Circle extends Shape {
    public Double radius;

    //method
    public void calculateArea() {
        System.out.println(Math.PI * radius * radius);

    }

}
