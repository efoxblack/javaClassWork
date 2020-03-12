public class person {
    public String name;
    public Integer age;

    // Constructor
    public person(String name, Integer age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
