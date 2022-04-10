package com.techelevator.States;

public class selectionOutOfStockState implements VendingMachineStates{
    VendingMachine vendingMachine;

    public selectionOutOfStockState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
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


    public void selectProduct() {

    }

    @Override
    public void dispenseProduct() {

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
