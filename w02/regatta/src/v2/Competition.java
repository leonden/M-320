package v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Competition {

    private String name;
    private Ship[] ships = new Ship[5];

    public Competition(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addShip(Ship ship) {
        for (int i = 0; i < ships.length; i++) {
            if (ships[i] == null) {
                ships[i] = ship;
                break;
            }
        }

    }

    public void start() {
        for (Ship ship : ships) {
            ship.race();
        }
    }

    public void printResult() {
        System.out.println("Competition: " + this.name);

        for (int i = 0; i < ships.length; i++) {
            System.out.println("ship number: " + ships[i].getNumber() + " - name: " + ships[i].getName() + " - time: " + ships[i].getTime());
        }

    }

}
