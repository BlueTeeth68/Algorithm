package com.design_pattern.builder_pattern.builders;

import com.design_pattern.builder_pattern.enums.CarType;
import com.design_pattern.builder_pattern.enums.Transmission;
import com.design_pattern.builder_pattern.models.Car;
import com.design_pattern.builder_pattern.models.Engine;
import com.design_pattern.builder_pattern.models.GPSNavigator;
import com.design_pattern.builder_pattern.models.TripComputer;

public class CarBuilder extends Builder<Car> {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;
    private double fuel = 0;

    public CarBuilder setSeats(int seat) {
        this.seats = seat;
        return this;
    }

    public CarBuilder setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setTransmission(Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
        return this;
    }

    public CarBuilder setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
        return this;
    }

    public CarBuilder setFuel(double fuel) {
        this.fuel = fuel;
        return this;
    }

    public CarBuilder setCarType(CarType carType) {
        this.carType = carType;
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(carType, seats, engine, transmission, tripComputer, gpsNavigator);
        car.setFuel(fuel);
        return car;
    }
}
