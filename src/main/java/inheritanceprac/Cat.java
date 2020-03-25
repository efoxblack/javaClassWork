package inheritanceprac;

public class Cat extends Animal {
    private int numOfWhiskers;

    public Cat (Boolean isAlive, int legs, int numOfWhiskers) {
        super(isAlive, legs);
        this.numOfWhiskers = numOfWhiskers;
    }

    @Override
    public String printAnimalSound () {
        return "Meow meow";
    }
}
