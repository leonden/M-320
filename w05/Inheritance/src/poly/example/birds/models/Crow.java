package poly.example.birds.models;

import poly.example.birds.enums.Gender;

public class Crow extends Bird {

    public Crow(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public String sing() {
        return "I'm a crow";
    }
}
