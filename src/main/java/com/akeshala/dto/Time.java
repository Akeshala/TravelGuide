package com.akeshala.dto;

import lombok.Getter;

@Getter
public class Time {

    private Integer time;

    public Time(Integer time) {
        setTime(time);
    }

    public void setTime(Integer time) {
        if (time < 0 || time >= 2400) throw new IllegalArgumentException("Time should be between 0 and 2400");
        this.time = time;
    }
}
