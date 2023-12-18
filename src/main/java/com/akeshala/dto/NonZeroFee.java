package com.akeshala.dto;

public class NonZeroFee extends Fee {

    public NonZeroFee(Double amount) {
        super(amount);
    }

    public void setAmount(Double amount) {
        if (amount <= 0.00) throw new IllegalArgumentException("Fee should be greater than zero");
        this.amount = amount;
    }
}
