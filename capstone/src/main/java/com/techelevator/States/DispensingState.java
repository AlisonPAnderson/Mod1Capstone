package com.techelevator.States;

import com.techelevator.Product.ProductGS;

import java.util.Scanner;

public class DispensingState implements VendingMachineStates {
    ProductGS productGS = new ProductGS();
    VendingMachine vendingMachine;
    String selectProductIDButtonPushed = HasMoneyState.selectProductIDButtonPushed;
    HasMoneyState hasMoneyState = new HasMoneyState();
    Scanner scanner = new Scanner(System.in);

    public DispensingState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public DispensingState() {
    }

    @Override
    public void displayMainMenu() {
        System.out.println("MM");

    }

    @Override
    public void displayPurchaseMenu() {
        System.out.println("PM");
    }

    @Override
    public void feedMoney() {
        System.out.println("FM");

    }

    @Override
    public void returnMoney() {
        System.out.println("RM");
    }

    @Override
    public void selectProduct() {
        System.out.println("SP");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("dispensing state - dispensing method");
      //  productGS.getMenu().get("A1").dispensing();

        System.out.println("dispensing:" + productGS.getMenu().getValue(selectProductIDButtonPushed).getName()+ " ...in progress");
        //System.out.println(productGS.getMenu().get("A1"));
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
