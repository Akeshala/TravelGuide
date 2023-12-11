package com.akeshala;

import com.akeshala.dto.Location;
import com.akeshala.factory.LocationFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Location> locationsList = LocationFactory.fetchLocations();

        // create an event to handle
        locationsList.stream()
                .filter(location -> location.getClosingTime() > 1900 && location.getFee() < 5)
                .map(Location::getName)
                .forEach(System.out::println);
    }
}