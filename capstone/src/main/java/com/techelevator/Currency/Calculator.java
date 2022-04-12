package com.techelevator.Currency;

public class Calculator {

    private double numOfNickels = 0;
    private double numOfDimes = 0;
    private double numOfQuarters = 0;

    double total = 0.00;


    public double CalculateChange() {
        numOfQuarters = total / Currency.QUARTER.getValue();
        total %= Currency.QUARTER.getValue();
        numOfDimes = total / Currency.DIME.getValue();
        total %= Currency.DIME.getValue();
        numOfNickels = total / Currency.NICKEL.getValue();
        total %= Currency.NICKEL.getValue();

        return total;

        }






    }

//    int total = 0;
//    total += this.numOfPennies * Currency.PENNY.getMoney();
//    total += this.numOfNickels * Currency.NICKEL.getMoney();
//    total += this.numOfDimes * Currency.DIME.getMoney();
//    total += this.numOfQuarters * Currency.QUARTER.getMoney();
//    total += this.numOfOneDollarBills * Currency.ONEDOLLARBILL.getMoney();
//    total += this.numOfFiveDollarBills * Currency.FIVEDOLLARBILL.getMoney();
//    total += this.numOfTenDollarBills * Currency.TENDOLLARBILL.getMoney();
//        return total;


