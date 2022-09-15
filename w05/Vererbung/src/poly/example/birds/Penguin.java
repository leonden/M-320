package poly.example.birds;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("I'm a penguin");
    }

    public void eat() {
        System.out.println("Penguin eats fish");
    }
}
