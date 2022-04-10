package com.techelevator.States;

import java.util.Scanner;

public class selectionMadeState implements VendingMachineStates{

    Scanner scanner = new Scanner(System.in);
    String buttonPushed = "";

    VendingMachine vendingMachine;
    public selectionMadeState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }


    @Override
    public void displayMainMenu() {

    }

    @Override
    public void displayPurchaseMenu() {
        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");

        //TODO Do we want to dispense the products from selection made state?
        if (buttonPushed.equals("1")) {


        } else if (buttonPushed.equals("2") ) {


        } else if (buttonPushed.equals("3")) {
// sends machine to reports and logging where we can finish transaction, give change, log the sale etc
            vendingMachine.setVendingMachineState(vendingMachine.reportsAndLoggingState);

        }

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
