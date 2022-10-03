package poly.example.birds.models;

import poly.example.birds.enums.Gender;

public class Bird {

    private String name;
    private Gender gender;

    public Bird(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // other methods

    public String sing() {
        return "Tweet Tweet";
    }

}
