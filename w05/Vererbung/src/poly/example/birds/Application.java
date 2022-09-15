package poly.example.birds;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Bird> birdList = new ArrayList<>();

        Bird penguinBird = new Penguin("Mr. Penguin");
        Bird crowBird = new Crow("Mr. Crow");
        Bird anotherBird = new AnotherBird("");

        birdList.add(penguinBird);
        birdList.add(crowBird);
        birdList.add(anotherBird);

        for (Bird bird : birdList) {
            bird.sing();
        }
    }
}
