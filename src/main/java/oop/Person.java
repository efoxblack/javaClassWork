package oop;

public class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String canRun(int speed) {
        return name + " can run at " + speed + " miles per hour.";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //    // Default Constructor
//    public Person () {
//        this("Mike");
//    }
//
//    // Overloaded Constructor
//    public Person (String name) {
//        this.name = name;
//    }
//
//    public Person (int age) {
//        this.age = age;
//    }
//
//    public Person (String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
}
