package v1;

public class Start {
    public static void main(String[] args) {
        Competition c = new Competition("Vierwaldstättersee-Cup");

        Ship ship1 = new Ship("v1.Ship 1");
        Ship ship2 = new Ship("v1.Ship 2");
        Ship ship3 = new Ship("v1.Ship 3");

        c.start();

        c.printResult();

    }
}
