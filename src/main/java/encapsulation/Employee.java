package encapsulation;

public class Employee extends Person {
    private float hoursWorked;
    private double hourlyRate;

    public Employee(String name, int age, float hoursWorked, double hourlyRate) {
        super(name, age);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "Employee{" +
                "hoursWorked=" + hoursWorked +
                ", hourlyRate=" + hourlyRate +
                '}';
    }
}
