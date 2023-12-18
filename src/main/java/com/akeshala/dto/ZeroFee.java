package com.akeshala.dto;

public class ZeroFee extends Fee {

    public ZeroFee(Double amount) {
        super(amount);
    }

    public void setAmount(Double amount) {
        if (amount != 0.00) throw new IllegalArgumentException("Fee should be zero");
        this.amount = amount;
    }
}
