/**
 * Class simulates a regatta competition
 *
 * @author Leon Hochwimmer
 * @version 1.0
 *
 */

public class Competition {

    private String name;
    private Ship[] ships = new Ship[5];

    /**
     * creates a competition object
     *
     * @param name name of the competition
     */
    public Competition(String name) {
        this.name = name;
    }

    /**
     * starts a competition and lets every ship do the race
     *
     * @see Ship#race()
     */
    public void start() {

        for (Ship s : this.ships) {
            if (s != null) {
                s.race();
            }
        }
    }

    /**
     * adds a ship to the competition, if there are free indexes in the array
     * @see Competition#ships
     *
     * @param ship the ship to add
     */
    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }
    }

    /**
     * prints end result of all ships to console
     */
    public void printResult() {
        System.out.println("Wettkampf: " + this.name);

        for (Ship s : this.ships) {
            if (s != null) {
                System.out.println("Schiff Nr: " + s.getNr() + " Name: " + s.getName() + " Zeit: " + s.getTime());
            }
        }
    }
}
