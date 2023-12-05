package com.akeshala.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Location {
    private String name;
    private Double fee;
    private Integer closingTime;
    private Integer openingTime;
}
