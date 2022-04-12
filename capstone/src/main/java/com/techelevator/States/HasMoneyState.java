package com.techelevator.States;


import com.techelevator.Product.Product;
import com.techelevator.Product.ProductGS;

import java.util.Map;
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

    }

    @Override
    public void displayPurchaseMenu() {
        System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");
        purchaseMenuButtonPushed = scanner.nextLine();
        switch (purchaseMenuButtonPushed) {
            case "1":

                vendingMachine.feedMoney();   // "Select Product send user to feed money method
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
    public void feedMoney() {

    }

    @Override
    public void returnMoney() {

    }

    @Override
    public void selectProduct() {
        Map menu = productGS.getMenu();
        productGS.printInventory();
        System.out.println("Please enter a valid product ID: ");
        selectProductIDButtonPushed = scanner.nextLine();
        if (productGS.getMenu().containsKey(selectProductIDButtonPushed)) {
            System.out.println("contains key $%$%&#%$^&#%^*");
            changeState();
        } else if (productGS.getMenu().get(selectProductIDButtonPushed).getQuantity() <= 0) {
            // TODO test out of stock
            System.out.println("I'm sorry, that selection is out of stock.");
            displayPurchaseMenu();
        } else   {
            System.out.println("You have entered an invalid code.  Please enter a valid product ID");
            productGS.printInventory();

        }



    }

    public void changeState() {
        System.out.println("SRFGHSRFGNSRTN");
        vendingMachine.setVendingMachineState(vendingMachine.getDispensingState());
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
