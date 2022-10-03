package poly.example.birds.models;

import poly.example.birds.enums.Gender;

public class Penguin extends Bird {

    public Penguin(String name, Gender gender) {
        super(name, gender);
    }

    @Override
    public String sing() {
        return "I'm a penguin";
    }
}
