package com.akeshala.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {
    private String name;
    private Double fee;
    private Integer closingTime;
    private Integer openingTime;

    public Location(String name, Double fee, Integer closingTime, Integer openingTime) {
        this.name = name;
        this.fee = fee;
        setClosingTime(closingTime);
        setOpeningTime(openingTime);
    }

    public void setClosingTime(Integer closingTime) {
        if (closingTime < 0) throw new IllegalArgumentException("Closing time cannot be negative");
        this.closingTime = closingTime;
    }

    public void setOpeningTime(Integer openingTime) {
        if (openingTime >= 2400)
            throw new IllegalArgumentException("Opening time cannot be greater than or equal to 2400");
        this.openingTime = openingTime;
    }
}
