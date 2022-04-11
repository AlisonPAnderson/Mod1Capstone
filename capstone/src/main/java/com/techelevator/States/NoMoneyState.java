package com.techelevator.States;

// TODO finish money logic in feedMoney method

import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class NoMoneyState implements VendingMachineStates {
    VendingMachine vendingMachine;
    String mainMenuButtonPushed = "";
    String purchaseMenuButtonPushed = "";
    Scanner scanner = new Scanner(System.in);

    //passing reference of the vending machine into the constructor
    public NoMoneyState(VendingMachine newVendingMachine) {
     this.vendingMachine = newVendingMachine;
    }

    @Override
    public void dispenseProduct() {

    }

    @Override
    public void displayMainMenu() {
        System.out.println ("(1) Display Vending Machine Items");
        System.out.println ("(2) Purchase");
        System.out.println ("(3) Exit");

        mainMenuButtonPushed = scanner.nextLine();

        switch (mainMenuButtonPushed) {
            case "1":
                ProductGS productGS = new ProductGS();
                productGS.printInventory();                    // Prints inventory from ProductGS

                break;
            case "2":
                vendingMachine.displayPurchaseMenu();
                break;
            case "3":
                System.exit(0);
        }

        }

    public void displayPurchaseMenu() {

        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");

        purchaseMenuButtonPushed = scanner.nextLine();

        switch (purchaseMenuButtonPushed) {
            case "1":
                vendingMachine.feedMoney(5);   // "Select Product send user to feed money method

                break;
            case "2":
                System.out.println("You have not inserted any money, you cannot select a product.");
                break;
            case "3":
                System.out.println("You have not inserted any money, I cannot finish this transaction.");
                break;
        }
    }

    @Override
    public void feedMoney(int cash) {

    System.out.println("Please choose how much money to insert");
        System.out.println ("(1) $1.00");
        System.out.println ("(5) $5.00");
        System.out.println ("(10) $10.00");

        //TODO accept user input
        // TODO make "Current Money Provided"  (is this a method? or a variable? IDK!)
    System.out.println("Would you like to insert more money? (Y/N)");
    vendingMachine.setVendingMachineState(vendingMachine.getHasMoneyState());   // THIS sends the program to the 'has money' state
    System.out.println("Would you like to insert more money? (Y/N)");
    }

    @Override
    public void returnMoney(int cash) {

    }

    @Override
    public void selectProduct() {

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
