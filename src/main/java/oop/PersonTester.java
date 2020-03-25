package oop;

public class PersonTester {
    public static void main(String[] args) {

        Person per1 = new Person("Johnny", 26);
        System.out.println(per1);
        System.out.println(per1.canRun(12));
        per1.setAge(27);
        System.out.println(per1.getAge());
        per1.setName("Mike");
        System.out.println(per1.getName());
        System.out.println(per1);

    }
}
