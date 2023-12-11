package com.akeshala.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public abstract class Location {
    protected String name;
    protected Double fee;
    protected Integer closingTime;
    protected Integer openingTime;

    public Location(String name, Double fee, Integer closingTime, Integer openingTime) {
        setFee(fee);
        setName(name);
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    public void setClosingTime(Integer closingTime) {
        if (closingTime < 0 || closingTime >= 2400)
            throw new IllegalArgumentException("Time should be between 0 and 2400");
        this.closingTime = closingTime;
    }

    public void setOpeningTime(Integer openingTime) {
        if (openingTime < 0 || openingTime >= 2400)
            throw new IllegalArgumentException("Time should be between 0 and 2400");
        this.openingTime = openingTime;
    }

    public void setFee(Double fee) {
        if (fee < 0.00) throw new IllegalArgumentException("Fee can not be negative");
        this.fee = fee;
    }
}
