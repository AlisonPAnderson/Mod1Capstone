package com.techelevator.States;

import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class SelectionMadeState implements VendingMachineStates{
    ProductGS productGS = new ProductGS();

    Scanner scanner = new Scanner(System.in);
    String selectProductIDButtonPushed = HasMoneyState.selectProductIDButtonPushed;

    VendingMachine vendingMachine;
    HasMoneyState hasMoneyState = new HasMoneyState();
    public SelectionMadeState(VendingMachine vendingMachine) {
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


    }

    @Override
    public void feedMoney(int cash) {

    }

    @Override
    public void returnMoney(int cash) {

    }

    @Override
    public void selectProduct() {

        switch (HasMoneyState.) {
            case "1":


                break;
            case "2":

                if (productGS.getInv().containsKey(selectProductIDButtonPushed)) {
                    vendingMachine.setVendingMachineState(vendingMachine.getDispensingState);
                    productGS.getInv().get(selectProductIDButtonPushed).dispensing();
                    System.out.println("dispensing:" + productGS.getInv().get(selectProductIDButtonPushed).getName() + " ...in " +
                            "progress");
                } else System.out.println("invalid code");


                break;
            case "3":
// sends machine to reports and logging where we can finish transaction, give change, log the sale etc
                vendingMachine.setVendingMachineState(vendingMachine.reportsAndLoggingState);

                break;
        }

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
