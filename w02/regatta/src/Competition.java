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
        System.out.println("Competition: " + this.name);
        System.out.println("ship no: <Ship.number>" + "<Ship.name> - name: " + "<Ship.time> - time: ");
    }

}
