import java.util.Random;

public class Ship {
    private int number;
    private String name;
    private int time;

    public Ship(String name) {
        this.name = name;
    }

    // number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // time
    public int getTime() {
        return time;
    }

    public void race() {
        int min =  300;
        int max = 600;
        this.time = (int) (Math.random() * (max - min + 1)) + min;
    }
}
