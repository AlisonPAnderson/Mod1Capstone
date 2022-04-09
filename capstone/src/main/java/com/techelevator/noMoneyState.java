package com.techelevator;

import java.util.Scanner;

public class noMoneyState implements VendingMachineStates {
    VendingMachine vendingMachine;
    String buttonPushed = "";
    Scanner scanner = new Scanner(System.in);

    //passing reference of the vending machine into the constructor
    public noMoneyState(VendingMachine newVendingMachine) {
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

        buttonPushed = scanner.nextLine();


        if (buttonPushed.equals("1")) {
        Inventory inventory = new Inventory();
        inventory.printInvantory();
        } else if (buttonPushed.equals("2")  ) {
            vendingMachine.displayPurchaseMenu();
        } else if (buttonPushed.equals("3") ) {
            System.exit(0);
        }

        }



    public void displayPurchaseMenu() {

        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");

        if (buttonPushed.equals("1")) {

            vendingMachine.feedMoney(5);   // "Select Product send user to feed money method
        } else if (buttonPushed.equals("2") ) {
            System.out.println("You have not inserted any money, you cannot select a product.");
        } else if (buttonPushed.equals("3")) {
            System.out.println("You have not inserted any money, I cannot finish this transaction.");
        }



    }

    @Override
    public void feedMoney(int cash) {

        // TODO accept money from user

    System.out.println("This is currently the 'no money' state");
    System.out.println("I have now fed money into the machine");
    vendingMachine.setVendingMachineState(vendingMachine.getHasMoneyState());   // THIS sends the program to the 'has money' state

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
