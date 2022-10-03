package abstraction.example.aircrafts.models;

import abstraction.example.aircrafts.Application;
import abstraction.example.aircrafts.enums.AircraftType;

public abstract class Aircraft {
    private String model;
    private AircraftType aircraftType;

    public Aircraft(String model, AircraftType aircraftType) {
        this.model = model;
        this.aircraftType = aircraftType;
    }

    public abstract void fly();
}
