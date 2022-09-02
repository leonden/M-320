package v1;

public class Competition {
    private String name;
    private Ship[] ships = new Ship[5];

    public Competition(String name) {
    }

    public String getName() {
        return name;
    }

    public void start() {

    }

    public void printResult() {
        System.out.println("v1.Competition: " + this.name);

        for (int i = 0; i <= ships.length; i++) {
            System.out.println("ship number: " + getName() + "<v1.Ship.name> - name: " + " - time: ");
        }

    }

}
