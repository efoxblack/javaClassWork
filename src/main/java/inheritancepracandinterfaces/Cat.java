package inheritancepracandinterfaces;

public class Cat extends Feline implements IPet{
    private int numOfWhiskers;

    public Cat (Boolean isAlive, int legs, int numOfWhiskers) {
        super(isAlive, legs);
        this.numOfWhiskers = numOfWhiskers;
    }

    @Override
    public String eat() {
        return "Cats eat fish and meat";
    }

    @Override
    public void greet() {
        System.out.println("Cat leisurely walks up to you and purrs when pet.");
    }
}
