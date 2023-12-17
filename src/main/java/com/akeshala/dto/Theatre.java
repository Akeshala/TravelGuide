package com.akeshala.dto;

public class Theatre extends Location {

    public Theatre(String name, Double fee, Integer closingTime, Integer openingTime){
        setName(name);
        setFee(fee);
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    @Override
    public void setFee(Double amount) {
        if (amount <= 0.00) throw new IllegalArgumentException("Theatre fee should be greater than zero");
        this.fee = new Fee(amount);
    }
}
