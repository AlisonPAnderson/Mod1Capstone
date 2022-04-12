package com.techelevator.States;

import java.io.FileNotFoundException;

public class VendingMachine implements VendingMachineStates {
    public int cash = 0;

    VendingMachineStates noMoneyState;
    VendingMachineStates hasMoneyState;
    VendingMachineStates selectionMadeState;
    VendingMachineStates selectionOutOfStockState;
    VendingMachineStates dispensingState;
    VendingMachineStates reportsAndLoggingState;
    VendingMachineStates vendingMachineStates;


    // empty and loaded constructors
    public VendingMachine() {
        noMoneyState = new NoMoneyState(this);
        hasMoneyState = new HasMoneyState(this);
        dispensingState = new DispensingState(this);
        reportsAndLoggingState = new ReportsAndLoggingState(this);


        vendingMachineStates = noMoneyState;
    }

        // setter to allow the vending machine to change states, using the VendingMachineStates instance variable
        void setVendingMachineState (VendingMachineStates newVendingMachineStates){
            this.vendingMachineStates = newVendingMachineStates;
        }




    @Override
    public void displayMainMenu () throws FileNotFoundException {
        vendingMachineStates.displayMainMenu();
    }

    @Override
    public void displayPurchaseMenu() { vendingMachineStates.displayPurchaseMenu();
    }

    @Override
        public void feedMoney (){
            vendingMachineStates.feedMoney();
        }

        @Override
        public void returnMoney ( ){
        }

        @Override
        public void selectProduct() {
            vendingMachineStates.selectProduct();
        }

    @Override
    public void dispenseProduct() { vendingMachineStates.dispenseProduct();

    }

    @Override
        public void displayItems () {

        }

        @Override
        public void finishTransaction () {

        }

        @Override
        public void salesReport () {

        }

        @Override
        public void auditLog () {

        }

        public VendingMachineStates getNoMoneyState () {
            return noMoneyState;
        }

        public VendingMachineStates getHasMoneyState () {
            return hasMoneyState;
        }

        public VendingMachineStates getSelectionMadeState () {
            return selectionMadeState;
        }

        public VendingMachineStates getSelectionOutOfStockState () {
            return selectionOutOfStockState;
        }

        public VendingMachineStates getDispensingState () {
            return dispensingState;
        }

        public VendingMachineStates getReportsAndLoggingState () {
            return reportsAndLoggingState;
        }

        public VendingMachineStates getVendingMachineStates () {
            return vendingMachineStates;
        }

    }

