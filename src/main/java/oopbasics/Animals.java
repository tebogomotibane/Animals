package oopbasics;

public class Animals {
    private final String name;

    public Animals(String animalName) {
        this.name = animalName;
    }

    public String getName() {
        return name;
    }

    public String sound() {
        return "sounds...";
    }

    public String eat() {
        return "\"{name}\"  eats";
    }
}
