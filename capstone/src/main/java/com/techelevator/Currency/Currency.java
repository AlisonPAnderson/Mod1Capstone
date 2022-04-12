package com.techelevator.Currency;

public enum Currency {

    PENNY(0.01), NICKEL(0.05), DIME(0.10), QUARTER(0.25), ONEDOLLARBILL(1.00), FIVEDOLLARBILL(5.00), TENDOLLARBILL(10.00);
    private double value;

    Currency(double money) {
        this.value = money;
    }
    public double getValue() {
        return value;
    }
}
