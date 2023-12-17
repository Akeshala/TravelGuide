package com.akeshala.dto;

public class Theatre extends Location {

    public Theatre(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
    }

    @Override
    public void setFee(Double amount) {
        if (amount <= 0.00) throw new IllegalArgumentException("Theatre fee should be greater than zero");
        super.setFee(amount);
    }
}
