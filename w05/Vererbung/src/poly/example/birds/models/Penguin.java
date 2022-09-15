package poly.example.birds.models;

import poly.example.birds.enums.Gender;

public class Penguin extends Bird {

    public Penguin(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public void sing() {
        System.out.println("I'm a penguin");
    }

    public void eat() {
        System.out.println("Penguin eats fish");
    }
}
