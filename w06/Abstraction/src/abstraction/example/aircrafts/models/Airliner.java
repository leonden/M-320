package abstraction.example.aircrafts.models;

import abstraction.example.aircrafts.enums.AircraftType;

public class Airliner extends Aircraft {

    public Airliner(String model, AircraftType aircraftType) {
        super(model, aircraftType);
    }

    @Override
    public void fly() {
        System.out.println(AircraftType.AIRLINER + " is flying");
    }
}
