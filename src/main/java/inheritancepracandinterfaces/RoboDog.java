package inheritancepracandinterfaces;

public class RoboDog implements IPet {
    @Override
    public void greet() {
        System.out.println("Slides up and wags tail mechanically");
    }
}
