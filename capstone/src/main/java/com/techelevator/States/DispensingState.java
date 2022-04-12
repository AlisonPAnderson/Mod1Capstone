package com.techelevator.States;

import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class DispensingState implements VendingMachineStates {
ProductGS productGS = new ProductGS();
VendingMachine vendingMachine;
String selectProductIDButtonPushed = HasMoneyState.selectProductIDButtonPushed;
HasMoneyState hasMoneyState = new HasMoneyState();
Scanner scanner = new Scanner(System.in);


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
        productGS.getMenu().get(selectProductIDButtonPushed).dispensing();
        System.out.println("dispensing:" + productGS.getMenu().get(selectProductIDButtonPushed).getName()+ " ...in progress");
        productGS.getMenu().get(selectProductIDButtonPushed).sound();
        System.out.println("Would you like to make another selection? (Y/N)");
        String anotherSelection = scanner.nextLine();

        switch (anotherSelection) {
            case ("Y"):
                hasMoneyState.selectProduct();
                break;
            case("N"):
                System.out.println("Please complete your transaction.");
                hasMoneyState.displayPurchaseMenu();
        }

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
