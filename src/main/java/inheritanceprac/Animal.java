package inheritanceprac;

public class Animal {
    private Boolean isAlive;
    private int legs;

    public Animal (Boolean isAlive, int legs) {
        this.isAlive = isAlive;
        this.legs = legs;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String printAnimalSound () {
        return "All animals make noise";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "isAlive=" + isAlive +
                ", legs=" + legs +
                '}';
    }
}
