package encapsulation;

public class EmployeeTester {

    public static void main(String[] args) {
//        Person p1 = new Person("Elton", 44);
//        System.out.println(p1);
        Employee emp1 = new Employee("John", 27, 5.3f, 10.5d);
        System.out.println(emp1);
        emp1.sex = 'M';
        System.out.println(emp1.sex);
        emp1.setPronoun("He/Him");
        System.out.println(emp1.getPronoun());
    }
}
