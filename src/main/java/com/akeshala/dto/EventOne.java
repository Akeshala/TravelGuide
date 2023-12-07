package com.akeshala.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EventOne implements Event {

    public boolean checkEvent(Location location) {
        return false;
    }
}
