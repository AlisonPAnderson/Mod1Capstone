package com.techelevator.States;

import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class DispensingState implements VendingMachineStates {
ProductGS productGS = new ProductGS();
VendingMachine vendingMachine;


    Scanner input = new Scanner(System.in);


    @Override
    public void displayMainMenu() {

    }

    @Override
    public void displayPurchaseMenu() {

    }

    @Override
    public void feedMoney(int cash) {

    }

    @Override
    public void returnMoney(int cash) {

    }

    @Override
    public void selectProduct() {

    }

    @Override
    public void dispenseProduct() {
        productGS.getInv().get(SelectionMadeState.getButtonPushed()).dispensing();
        System.out.println("dispensing:" + productGS.getInv().get(SelectionMadeState.getButtonPushed()).getName()+ " ...in progress");
        productGS.getMenu().get(SelectionMadeState.getButtonPushed()).sound();
        vendingMachine.setVendingMachineState(vendingMachine.getHasMoneyState());

    }

    @Override
    public void displayItems() {

    }

    @Override
    public void finishTransaction() {

    }

    @Override
    public void salesReport() {

    }

    @Override
    public void auditLog() {

    }
}
