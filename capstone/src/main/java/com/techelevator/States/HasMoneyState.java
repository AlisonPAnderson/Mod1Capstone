package com.techelevator.States;


import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class HasMoneyState implements VendingMachineStates{
    VendingMachine vendingMachine;
    Scanner scanner = new Scanner(System.in);
    static String selectProductIDButtonPushed = "";
    String displayMenuButtonPushed = "";
    String purchaseMenuButtonPushed = "";
    ProductGS productGS = new ProductGS();



    public HasMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public HasMoneyState() {
    }

    @Override
    public void displayMainMenu() {
        System.out.println ("(1) Display Vending Machine Items");
        System.out.println ("(2) Purchase");
        System.out.println ("(3) Exit");
        displayMenuButtonPushed = scanner.nextLine();


        switch (displayMenuButtonPushed) {
            case "1":

                ProductGS productGS = new ProductGS();
                productGS.printInventory();                 // prints inventory
                break;
            case "2":
                vendingMachine.displayPurchaseMenu();
                break;
            case "3":
                System.exit(0);
        }

    }

    @Override
    public void displayPurchaseMenu() {
        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");
        purchaseMenuButtonPushed = scanner.nextLine();
        switch (purchaseMenuButtonPushed) {
            case "1":

                // TODO logic how the machine accepts (more) money
                vendingMachine.feedMoney(5);   // "Select Product send user to feed money method


                break;
            case "2":
                vendingMachine.selectProduct();

                break;
            case "3":
                System.out.println("You have not selected a product yet");
                break;
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
        productGS.printInventory();
        System.out.println("Please enter a valid product ID: ");
        selectProductIDButtonPushed = scanner.nextLine();

      
        if (!(productGS.getMenu().containsKey(selectProductIDButtonPushed))) {
            System.out.println("You have entered an invalid code.");
            productGS.printInventory();
            System.out.println("Please enter a valid product ID: ");

        } else if (productGS.getMenu().get(selectProductIDButtonPushed).getQuantity() <= 0) {
            vendingMachine.setVendingMachineState(vendingMachine.selectionOutOfStockState);
        } else {
            vendingMachine.setVendingMachineState(vendingMachine.getSelectionMadeState());
        }
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
//  System.out.println("new list");
//
//          for (Map.Entry<String, Product> item : inv.entrySet()) {
//        System.out.println("item code: " + item.getKey() + "  name:" + item.getValue().getName() + " quantity: " + item.getValue().getQuantity() + " price: " + item.getValue().getPrice());
//        }
//
//
//        // TODO figure out how to take product selection involving the file, Inventory class
//        System.out.println("You want to select a product");
//        vendingMachine.selectProduct();