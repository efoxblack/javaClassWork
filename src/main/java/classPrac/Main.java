package classPrac;

public class Main {

    public static void main(String[] args) {
        Student one = new Student();
        Student two = new Student();

        one.name = "John";
        two.name = "Sam";

        one.address = "123 Street St.";
        one.phoneNum = "888-888-8888";
        one.roll_no = 5;

        two.address = "643 Home St.";
        two.phoneNum = "555-555-5555";
        two.roll_no = 1;

        System.out.println(two.name +  "'s address is " + two.address +
                ", and their phone number is " + two.phoneNum + ".");

        Triangle trig = new Triangle(2, 5, 6);
        //System.out.println(trig);

        Rectangle uno = new Rectangle(4, 5);
        Rectangle dos = new Rectangle(5, 8);
        System.out.println("Area: " + uno.getArea() + ", the Perimeter is: " + uno.getPerimeter());
        System.out.println("Area: " + dos.getArea() + ", the Perimeter is: " + dos.getPerimeter());



    }
}
