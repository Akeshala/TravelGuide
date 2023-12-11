package com.akeshala.dto;

public class Park extends Location {

    public Park(String name, Double fee, Integer closingTime, Integer openingTime){
        setFee(fee);
        setName(name);
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    @Override
    public void setFee(Double fee) {
        if (fee != 0.00) throw new IllegalArgumentException("Theatre fee should be zero");
        this.fee = fee;
    }
}
