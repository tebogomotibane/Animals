package oopbasics;

import java.text.MessageFormat;
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
        return MessageFormat.format("{0}  eats",name);
    }
}
