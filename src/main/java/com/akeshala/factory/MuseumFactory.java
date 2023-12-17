package com.akeshala.factory;

import com.akeshala.dto.Location;
import com.akeshala.dto.Museum;

import java.util.List;

public class MuseumFactory implements LocationFactory {

    @Override
    public Location create(String name, Double fee, Integer closingTime, Integer openingTime) {
        return new Museum(name, fee, closingTime, openingTime);
    }

    @Override
    public List<Location> createMultiple() {
        return List.of(
            create("National Museum", 4.50, 2200, 800),
            create("Galle Museum", 0.00, 1800, 800),
            create("British Museum", 2.00, 1700, 800)
        );
    }
}
