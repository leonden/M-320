public class Competition {
    private String name;
    private Ship[] ships = new Ship[5];

    public Competition(String name) {
    }

    public String getName() {
        return name;
    }

    public void start() {
//        for (Ship s : this.ships) {
//            if (s != null) {
//                s.race();
//            }
    }

    public void printResult() {
        System.out.println("Competition: " + this.name);

        for (int i = 0; i <= ships.length; i++) {
            System.out.println("ship number: " + getName() + "<Ship.name> - name: " + " - time: ");
        }

    }

}
