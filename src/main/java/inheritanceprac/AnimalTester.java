package inheritanceprac;

public class AnimalTester {
    public static void main(String[] args) {
        Animal wildAnimal = new Animal(true, 4);
        System.out.println(wildAnimal.getLegs());
        System.out.println(wildAnimal.printAnimalSound());

        Dog yorkie = new Dog(true, 4, true);
        System.out.println(yorkie.printAnimalSound());

        Cat tabby = new Cat(true, 4, 25);
        System.out.println(tabby.printAnimalSound());

        Animal[] animals = {yorkie, tabby};

        for (Animal a: animals) {
            System.out.println(a.printAnimalSound());
        }
    }
}
