package com.design_pattern.builder_pattern;

import com.design_pattern.builder_pattern.builders.CarBuilder;
import com.design_pattern.builder_pattern.director.Director;
import com.design_pattern.builder_pattern.models.Car;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();

        director.constructSportsCar(carBuilder);
        Car car = carBuilder.build();
        System.out.println("Car built type: " + car.getCarType());
    }
}