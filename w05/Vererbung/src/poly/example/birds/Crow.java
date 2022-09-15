package poly.example.birds;

public class Crow extends Bird {


    public Crow(String name) {
        super(name);
    }

    @Override
    public void sing() {
        System.out.println("I'm a crow");
    }
}
