package com.akeshala.factory;

import com.akeshala.dto.Location;
import com.akeshala.dto.Theatre;

import java.util.List;

public class TheatreFactory implements LocationFactory {

    @Override
    public Location create(String name, Double fee, Integer closingTime, Integer openingTime) {
        return new Theatre(name, fee, closingTime, openingTime);
    }

    @Override
    public List<Location> createMultiple() {
        return List.of(
            create("Tower Hall", 12.23, 2200, 900),
            create("New Theatre", 10.50, 2100, 900),
            create("Drama Academy", 4.50, 2000, 900)
        );
    }
}
