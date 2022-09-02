package v2;

public class Start {

    public static void main(String[] args) {

        Competition competition = new Competition("test");

        competition.addShip(new Ship("Ship 1", 1));
        competition.addShip(new Ship("Ship 2", 2));
        competition.addShip(new Ship("Ship 3", 3));
        competition.addShip(new Ship("Ship 4", 4));
        competition.addShip(new Ship("Ship 5", 5));

        competition.start();
        competition.printResult();



    }

}
