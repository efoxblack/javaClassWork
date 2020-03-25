package oop;

public class Animal {
    public String sciName;
    public String kingdom;

    public Animal () {

    }

    public Animal (String sciName, String kingdom) {
        this.sciName = sciName;
        this.kingdom = kingdom;
    }

    public String canFly (int speed) {
        return sciName + " can fly " + speed + " miles per hour";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "sciName='" + sciName + '\'' +
                ", kingdom='" + kingdom + '\'' +
                '}';
    }
}
