package inheritanceprac;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee e1 = new Employee("Elton", "John", 123561, "Musician");

        System.out.println(e1.printEmployeeProfile());
        e1.setBonus(400);
        System.out.println("Employee's salary after the bonus: $" + e1.payCheck());
        System.out.println(e1);
    }
}
