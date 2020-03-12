package sprhr;

public class Superhero {

    public String name;
    public String superPower;

    public Superhero(String name, String superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public void printSuperHero() {
        System.out.println(name + "'s special power is " + superPower);
    }
}
