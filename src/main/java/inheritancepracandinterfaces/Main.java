package inheritancepracandinterfaces;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 8);

        System.out.println(triangle1.calculateArea());

        triangle1.setBase(22);
        triangle1.setHeight(10);

        System.out.println(triangle1.calculateArea(5));

        System.out.println(triangle1.calculateArea());
    }
}
