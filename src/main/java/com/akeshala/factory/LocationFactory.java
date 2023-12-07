package com.akeshala.factory;

import com.akeshala.dto.Location;
import com.akeshala.dto.Museum;
import com.akeshala.dto.Park;
import com.akeshala.dto.Theatre;

import java.util.ArrayList;
import java.util.List;

public class LocationFactory {
    public static ArrayList<Location> createLocations() {
        ArrayList<Location> locations = new ArrayList<>();

        locations.addAll(createTheatres());
        locations.addAll(createMuseums());
        locations.addAll(createParks());

        return locations;
    }

    private static List<Theatre> createTheatres() {
        return List.of(
                new Theatre("Tower Hall", 12.23, 2200, 900),
                new Theatre("New theatre", 10.50, 2100, 900),
                new Theatre("Drama academy", 4.50, 2000, 900)
        );
    }

    private static List<Museum> createMuseums() {
        return List.of(
                new Museum("National museum", 4.50, 2200, 800),
                new Museum("Galle museum", 0.00, 1800, 800),
                new Museum("British museum", 2.00, 1700, 800)
        );
    }

    private static List<Park> createParks() {
        return List.of(
                new Park("Viharamha Devi", 0.00, 2200, 800),
                new Park("National Park", 0.00, 1700, 800),
                new Park("Children's park", 0.00, 1700, 800)
        );
    }
}
