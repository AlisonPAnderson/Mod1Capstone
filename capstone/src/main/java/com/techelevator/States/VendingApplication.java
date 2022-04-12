package com.techelevator.States;

import com.techelevator.Product.ProductGS;
import com.techelevator.States.VendingMachine;

import java.io.FileNotFoundException;

public class VendingApplication extends VendingMachine {

    public int cash = 0;


    public static void main(String[] args) throws FileNotFoundException {

        VendingMachine vendingMachine = new VendingMachine();


        vendingMachine.displayMainMenu();
        vendingMachine.feedMoney();
        vendingMachine.selectProduct();


    }
}
