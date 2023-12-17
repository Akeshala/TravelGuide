package com.akeshala.factory;

import com.akeshala.dto.Location;

import java.util.List;

interface LocationFactory {

    Location create(String name, Double fee, Integer closingTime, Integer openingTime);

    List<Location> createMultiple();
}
