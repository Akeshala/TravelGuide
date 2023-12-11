package com.akeshala.dto;

public class Theatre extends Location {

    public Theatre(String name, Double fee, Integer closingTime, Integer openingTime){
        setFee(fee);
        setName(name);
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    @Override
    public void setFee(Double fee) {
        if (fee <= 0.00) throw new IllegalArgumentException("Theatre fee should be greater than zero");
        this.fee = fee;
    }
}
