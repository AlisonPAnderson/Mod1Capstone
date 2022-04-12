package com.techelevator.States;

import java.util.Scanner;

public class ReportsAndLoggingState implements VendingMachineStates{

    Scanner scanner = new Scanner(System.in);
    String buttonPushed = "";

    VendingMachine vendingMachine;
    public ReportsAndLoggingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void displayMainMenu() {

    }

    @Override
    public void displayPurchaseMenu() {

    }

    @Override
    public void feedMoney() {

    }

    @Override
    public void returnMoney() {

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

        // TODO we need to give customer change, and make a log file and stuff
        // after the change given, balance update, logging reports and all

        // send user back to no money state to display the main menu
        vendingMachine.setVendingMachineState(vendingMachine.noMoneyState);

    }

    @Override
    public void salesReport() {

    }

    @Override
    public void auditLog() {

    }
}
