package classPrac;

public class Rectangle {
    public Integer side1;
    public Integer side2;

    public Rectangle(int sideuno, int sidedos) {
        side1 = sideuno;
        side2 = sidedos;
    }

    public int getArea() {
        return side1 * side2;
    }

    public int getPerimeter() {
        return 2*(side1 + side2);
    }
}
