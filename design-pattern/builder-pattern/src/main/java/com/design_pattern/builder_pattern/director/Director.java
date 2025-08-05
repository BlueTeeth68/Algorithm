package com.design_pattern.builder_pattern.director;

import com.design_pattern.builder_pattern.builders.CarBuilder;
import com.design_pattern.builder_pattern.builders.EngineBuilder;
import com.design_pattern.builder_pattern.enums.CarType;
import com.design_pattern.builder_pattern.enums.Transmission;
import com.design_pattern.builder_pattern.models.GPSNavigator;
import com.design_pattern.builder_pattern.models.TripComputer;

public class Director {

    public void constructSportsCar(CarBuilder builder) {
        builder.setCarType(CarType.SPORT_CAR)
                .setSeats(2)
                .setFuel(12.5)
                .setEngine(new EngineBuilder().setVolume(2.0).setMileage(100).build())
                .setTransmission(Transmission.AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(CarBuilder builder) {
        builder.setCarType(CarType.SUV)
                .setSeats(4)
                .setFuel(20)
                .setEngine(new EngineBuilder().setVolume(2.0).setMileage(150).build())
                .setTransmission(Transmission.SEMI_AUTOMATIC)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(CarBuilder builder) {
        builder.setCarType(CarType.ELECTRIC_CAR)
                .setSeats(4)
                .setFuel(15)
                .setEngine(new EngineBuilder().setVolume(2.0).setMileage(150).build())
                .setTransmission(Transmission.SINGLE_SPEED)
                .setTripComputer(new TripComputer())
                .setGPSNavigator(new GPSNavigator());
    }
}
