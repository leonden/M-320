package poly.example.birds;

import poly.example.birds.enums.Gender;
import poly.example.birds.models.AnotherBird;
import poly.example.birds.models.Bird;
import poly.example.birds.models.Crow;
import poly.example.birds.models.Penguin;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();

        Bird penguinBird = new Penguin("Mr. Penguin", Gender.MALE);
        Bird crowBird = new Crow("Mr. Crow", Gender.OTHER);
        Bird anotherBird = new AnotherBird("", Gender.FEMALE);

        birdList.add(penguinBird);
        birdList.add(crowBird);
        birdList.add(anotherBird);

        for (Bird bird : birdList) {
            bird.sing();
        }
    }

}
