package com.akeshala.factory;

import com.akeshala.dto.Location;
import com.akeshala.dto.Park;

import java.util.List;

public class ParkFactory implements LocationFactory {

    public Location create(String name, Double fee, Integer closingTime, Integer openingTime) {
        return new Park(name, fee, closingTime, openingTime);
    }

    @Override
    public List<Location> createMultiple() {
        return List.of(
            create("Viharamaha Devi", 0.00, 2200, 800),
            create("National Park", 0.00, 1700, 800),
            create("Children's Park", 0.00, 1700, 800)
        );
    }
}
