package com.design_pattern.builder_pattern.models;

public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "Tan Binh district, Ho Chi Minh city, VietNam";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
