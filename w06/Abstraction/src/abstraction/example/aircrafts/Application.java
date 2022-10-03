package abstraction.example.aircrafts;

import abstraction.example.aircrafts.enums.AircraftType;
import abstraction.example.aircrafts.models.Aircraft;
import abstraction.example.aircrafts.models.Airliner;
import abstraction.example.aircrafts.models.Jet;
import abstraction.example.aircrafts.models.Light;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Aircraft> aircraftList = new ArrayList<>();

        Aircraft airliner = new Airliner("Airbus A320", AircraftType.AIRLINER);
        Aircraft light = new Light("Baron G58", AircraftType.LIGHT);
        Aircraft jet = new Jet("F18 Super Hornet", AircraftType.JET);

        aircraftList.add(airliner);
        aircraftList.add(light);
        aircraftList.add(jet);

        for (Aircraft aircrafts : aircraftList) {
            aircrafts.fly();
        }
    }
}
