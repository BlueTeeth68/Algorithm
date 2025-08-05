package com.design_pattern.builder_pattern.builders;

import com.design_pattern.builder_pattern.models.Engine;

public class EngineBuilder extends Builder<Engine> {
    private double volume;
    private double mileage;
    private boolean started;

    public EngineBuilder setVolume(double volume) {
        this.volume = volume;
        return this;
    }

    public EngineBuilder setMileage(double mileage) {
        this.mileage = mileage;
        return this;
    }

    public EngineBuilder setStarted(boolean started) {
        this.started = started;
        return this;
    }

    public Engine build() {
        Engine engine = new Engine(volume, mileage);
        if (started) {
            engine.on();
        }
        return engine;
    }
}
