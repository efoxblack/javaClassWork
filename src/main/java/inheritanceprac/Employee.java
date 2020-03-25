package inheritanceprac;

public class Employee {
    private String firstName;
    private String lastName;
    private final String socialSecurityNumber = "333-33-3333";
    private int salary;
    private String title;
    private int bonus;

    public Employee (String firstName, String lastName, int salary, String title) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int payCheck () {
        return bonus + salary;
    }

    public String printEmployeeProfile () {
        return "Employee's Full Name: " + firstName + " " + lastName + "\n" +
                "Employee's Salary: $" + salary + "\n" +
                "Employee's Title: " + title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", bonus=" + bonus +
                '}';
    }
}
