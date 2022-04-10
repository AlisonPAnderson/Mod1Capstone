package com.techelevator;

import com.techelevator.States.VendingMachine;

public class VendingApplication extends VendingMachine {

    public int cash = 0;


    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.displayMainMenu();
        vendingMachine.feedMoney(5);
        vendingMachine.selectProduct();


    }
}
