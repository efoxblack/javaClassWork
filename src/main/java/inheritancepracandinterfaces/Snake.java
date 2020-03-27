package inheritancepracandinterfaces;

public class Snake implements IPet {

    @Override
    public void greet() {
        System.out.println("Snake slithers towards the glass and hisses at you.");
    }
}
