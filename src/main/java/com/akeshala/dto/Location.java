package com.akeshala.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Location {
    protected String name;
    protected Fee fee;
    protected Time closingTime;
    protected Time openingTime;

    public Location(String name, Double fee, Integer closingTime, Integer openingTime) {
        setName(name);
        setFee(fee);
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    public void setClosingTime(Integer closingTime) {
        this.closingTime = new Time(closingTime);
    }

    public void setOpeningTime(Integer openingTime) {
        this.openingTime = new Time(openingTime);
    }

    public void setFee(Double amount) {
        this.fee = new Fee(amount);
    }
}
