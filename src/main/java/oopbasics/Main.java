package oopbasics;

import oopbasics.Animals;
import oopbasics.Dog;
import oopbasics.Cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dog dog1 = new Dog();
        Dog dog2 = new Dog("Simba");
//        System.out.println(dog1.eat()); //Rax eats
//        System.out.println(dog1.sound()); //Bark

        System.out.println(dog2.eat()); //Simba eats
        System.out.println(dog2.sound()); //Bark

//        Cat cat1 = new Cat();
        Cat cat2 = new Cat("Smokey");
//        System.out.println(cat1.eat()); //Stormy eats
//        System.out.println(cat1.sound()); //Meow

        System.out.println(cat2.eat()); //Smokey eats
        System.out.println(cat2.sound()); //Meow
    }
}