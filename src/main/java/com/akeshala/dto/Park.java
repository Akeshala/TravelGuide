package com.akeshala.dto;

public class Park extends Location {

    private static final Double ZERO_FEE = 0.0;
    public Park(String name, Integer closingTime, Integer openingTime){

        super(name, ZERO_FEE, closingTime, openingTime);
    }

}
