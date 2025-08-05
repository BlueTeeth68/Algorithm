package com.design_pattern.builder_pattern.models;

public class TripComputer {
    private Car car;

    public TripComputer() {
    }

    public TripComputer(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void showFuel() {
        System.out.println("Fuel level: " + car.getFuel());
    }

}
