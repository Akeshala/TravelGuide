package com.akeshala.dto;

public class Theatre extends Location {

    // charge
    public Theatre(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
        if (fee <= 0.00) {
            throw new IllegalArgumentException("Theatre fee should be greater than zero");
        }
    }

}
