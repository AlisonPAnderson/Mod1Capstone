package com.techelevator.Currency;

import com.techelevator.Product.ProductGS;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineBalance {

    ProductGS productGS = new ProductGS();
    private List<Currency> vendingMachineCurrency = new ArrayList<>();

    private int numOfPennies = 0;
    private int numOfNickels = 0;
    private int numOfDimes = 0;
    private int numOfQuarters = 0;
    private int numOfOneDollarBills = 0;
    private int numOfFiveDollarBills = 0;
    private int numOfTenDollarBills = 0;

    public int getTotal() {
        int total = 0;
        total += this.numOfPennies * Currency.PENNY.getValue();
        total += this.numOfNickels * Currency.NICKEL.getValue();
        total += this.numOfDimes * Currency.DIME.getValue();
        total += this.numOfQuarters * Currency.QUARTER.getValue();
        total += this.numOfOneDollarBills * Currency.ONEDOLLARBILL.getValue();
        total += this.numOfFiveDollarBills * Currency.FIVEDOLLARBILL.getValue();
        total += this.numOfTenDollarBills * Currency.TENDOLLARBILL.getValue();
        return total;
    }
}
