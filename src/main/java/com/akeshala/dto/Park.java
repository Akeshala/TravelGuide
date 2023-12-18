package com.akeshala.dto;

public class Park extends Location {

    public Park(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
    }

    @Override
    public void setFee(Double amount) {
        this.fee = new ZeroFee(amount);
    }
}
