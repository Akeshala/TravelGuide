package com.akeshala.dto;

public class Museum extends Location {

    // some have free admittance
    public Museum(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
    }

}
