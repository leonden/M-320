public class Competition {
    private String name;
    private Ship[] ships = new Ship[5];

    Competition competitionName = new Competition("Vierwaldstättersee-Cup");

    public Competition(String name) {
    }

    public String getName() {
        return name;
    }

    public void start() {
    }

    public void printResult() {
        System.out.println("Schiff Nr: " + " - Name: " + " - Zeit: ");
    }

}
