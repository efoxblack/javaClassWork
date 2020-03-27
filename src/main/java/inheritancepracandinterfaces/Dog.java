package inheritancepracandinterfaces;

public class Dog extends Canine implements IPet{
    private Boolean hasTail;

    public Dog (Boolean isAlive, int legs, Boolean hasTail) {
        super(isAlive, legs);
        this.hasTail = hasTail;
    }

    @Override
    public String eat(){
        return "Dogs like to eat meat";
    }

    @Override
    public void greet() {
        System.out.println("Happily runs up to owner and barks");
    }
}
