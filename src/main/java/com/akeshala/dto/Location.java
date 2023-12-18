package com.akeshala.dto;

import lombok.Getter;
import lombok.Setter;

public abstract class Location {

    @Getter
    @Setter
    protected String name;

    protected Fee fee;
    protected Time closingTime;
    protected Time openingTime;

    public Location(String name, Double fee, Integer closingTime, Integer openingTime) {
        if (closingTime <= openingTime)
            throw new IllegalArgumentException("closingTime must be greater than openingTime");
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
        this.fee = new GeneralFee(amount);
    }

    public Double getFee() {
        return fee.getAmount();
    }

    public Integer getClosingTime() {
        return closingTime.getTime();
    }

    public Integer getOpeningTime() {
        return openingTime.getTime();
    }
}
