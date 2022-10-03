package abstraction.example.aircrafts.models;

import abstraction.example.aircrafts.enums.AircraftType;

public class Jet extends Aircraft {
    public Jet(String model, AircraftType aircraftType) {
        super(model, aircraftType);
    }

    @Override
    public void fly() {
        System.out.println(AircraftType.JET + " is flying");
    }
}
