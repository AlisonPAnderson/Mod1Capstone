package com.techelevator.States;

// TODO finish money logic in feedMoney method

import com.techelevator.Product.Product;
import com.techelevator.Product.ProductGS;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class NoMoneyState implements VendingMachineStates {
    VendingMachine vendingMachine;
    String mainMenuButtonPushed = "";
    String purchaseMenuButtonPushed = "";
    String YorN = "";
    int customerMoneyInserted = 0;
    String path = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1-capstone" +
            "\\capstone\\vendingmachine.csv";
    ProductGS productGS = new ProductGS();
    Scanner scanner = new Scanner(System.in);

    //passing reference of the vending machine into the constructor
    public NoMoneyState(VendingMachine newVendingMachine) {
     this.vendingMachine = newVendingMachine;
    }

    @Override
    public void dispenseProduct() {

    }

    @Override
    public void displayMainMenu() throws FileNotFoundException {
        System.out.println ("(1) Display Vending Machine Items");
        System.out.println ("(2) Purchase");
        System.out.println ("(3) Exit");
        mainMenuButtonPushed = scanner.nextLine();

        switch (mainMenuButtonPushed) {
            case "1":
                ProductGS productGS = new ProductGS();
                System.out.println("No money state  - display main menu method");
                productGS.printInventory();// Prints inventory from ProductGS
                displayMainMenu();
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
                vendingMachine.feedMoney();   // "Select Product send user to feed money method

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
    public void feedMoney() {

    System.out.println("Please choose how much money to insert");
        System.out.println ("(1) $1.00");
        System.out.println ("(5) $5.00");
        System.out.println ("(10) $10.00");

        customerMoneyInserted = scanner.nextInt();

        //TODO accept user input
        // TODO make "Current Money Provided"  (is this a method? or a variable? IDK!)
    System.out.println("Would you like to insert more money? (Y/N)");
    YorN = scanner.next();
    YorN = YorN.toLowerCase(Locale.ROOT);
   if (YorN.equals("y")) {
       feedMoney();
        }
   if (YorN.equals("n")) {
       vendingMachine.setVendingMachineState(vendingMachine.getHasMoneyState());
   }


    }

    @Override
    public void returnMoney() {

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
