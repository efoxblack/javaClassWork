package inheritanceprac;

public class Dog extends Animal {
    private Boolean hasTail;

    public Dog (Boolean isAlive, int legs, Boolean hasTail) {
        super(isAlive, legs);
        this.hasTail = hasTail;
    }

    @Override
    public String printAnimalSound(){
        return "Woof woof";
    }
}
