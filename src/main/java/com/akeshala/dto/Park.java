package com.akeshala.dto;

public class Park extends Location {

    public Park(String name, Double fee, Integer closingTime, Integer openingTime){
        super(name, fee, closingTime, openingTime);
    }

    @Override
    public void setFee(Double amount) {
        if (amount != 0.00) throw new IllegalArgumentException("Theatre fee should be zero");
        super.setFee(amount);
    }
}
