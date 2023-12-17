package com.akeshala;

import com.akeshala.dto.Location;
import com.akeshala.factory.MuseumFactory;
import com.akeshala.factory.ParkFactory;
import com.akeshala.factory.TheatreFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ParkFactory parkFactory = new ParkFactory();
        TheatreFactory theatreFactory = new TheatreFactory();
        MuseumFactory museumFactory = new MuseumFactory();

        ArrayList<Location> locationsList = new ArrayList<>();
        locationsList.addAll(parkFactory.createMultiple());
        locationsList.addAll(theatreFactory.createMultiple());
        locationsList.addAll(museumFactory.createMultiple());

        locationsList.stream()
                .filter(location -> location.getClosingTime().getTime() > 1900 && location.getFee().getAmount() < 5)
                .map(Location::getName)
                .forEach(System.out::println);
    }
}
