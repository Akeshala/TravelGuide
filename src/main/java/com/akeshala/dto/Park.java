package com.akeshala.dto;

public class Park extends Location {

    public Park(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
        if (fee != 0.00) throw new IllegalArgumentException("Theatre fee should be zero");
    }

}
