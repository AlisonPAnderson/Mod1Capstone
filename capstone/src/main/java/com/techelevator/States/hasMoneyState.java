package com.techelevator.States;

import com.techelevator.Inventory;

import java.util.Scanner;

public class hasMoneyState implements VendingMachineStates{
    Scanner scanner = new Scanner(System.in);
    String buttonPushed = "";

    VendingMachine vendingMachine;
    public hasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void displayMainMenu() {
        System.out.println ("(1) Display Vending Machine Items");
        System.out.println ("(2) Purchase");
        System.out.println ("(3) Exit");
        buttonPushed = scanner.nextLine();


        if (buttonPushed.equals("1")) {
            Inventory inventory = new Inventory();
           // inventory.printInvantory();
           // inventory.testInvantory();
        } else if (buttonPushed.equals("2")  ) {
            vendingMachine.displayPurchaseMenu();
        } else if (buttonPushed.equals("3") ) {
            System.exit(0);
        }

    }

    @Override
    public void displayPurchaseMenu() {
        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");

        if (buttonPushed.equals("1")) {
           // TODO logic how the machine accepts (more) money
            vendingMachine.feedMoney(5);   // "Select Product send user to feed money method
        } else if (buttonPushed.equals("2") ) {
            // TODO figure out how to take product selection involving the file, Inventory class
            System.out.println("You want to select a product");
            vendingMachine.selectProduct();

        } else if (buttonPushed.equals("3")) {
            System.out.println("You have not selected a product yet");
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
        System.out.println("This is currently the 'has money' state, select product method");
        System.out.println("I have now picked a product");
        // TODO IF statement - Product out of stock  OR product in stock

        //product in stock - machine goes to 'selection made state
       // vendingMachine.setVendingMachineState(vendingMachine.selectionMadeState);   // THIS sends the program to the 'selection made' state

        // product out of stock - machine goes to selection out of stock state
        // vendingMachine.setVendingMachineState(vendingMachine.selectionOutOfStockState); // this sends program to selectionOOS state


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
