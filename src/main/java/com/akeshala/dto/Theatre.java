package com.akeshala.dto;

public class Theatre extends Location {

    public Theatre(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
    }

    @Override
    public void setFee(Double amount) {
        this.fee = new NonZeroFee(amount);
    }
}
