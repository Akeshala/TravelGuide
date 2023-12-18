package com.akeshala.dto;

import lombok.Getter;

@Getter
public abstract class Fee {

    protected Double amount;

    public Fee(Double amount) {
        setAmount(amount);
    }

    public void setAmount(Double amount) {
        if (amount < 0.00) throw new IllegalArgumentException("Fee can not be negative");
        this.amount = amount;
    }
}
