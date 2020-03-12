package animal;

public class AnimalTester {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.name = "fido";
        dog.eat();
        cat.name = "tom";
        cat.eat();

    }
}
