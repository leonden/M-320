package poly.example.birds;

public class Bird {

    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // other methods

    public void sing() {
        System.out.println("Tweet Tweet");
    }

}
