package inheritancepracandinterfaces;

public class AnimalTester {
    public static void main(String[] args) {
        Dog germanShepard = new Dog(true, 4, true);
        Cat tabbyCat = new Cat(true, 4, 44);
        RoboDog roboDog = new RoboDog();
        Snake anaconda = new Snake();

        anaconda.greet();
        roboDog.greet();
        tabbyCat.greet();


        System.out.println(germanShepard.eat());
        System.out.println(tabbyCat.eat());

    }
}
