package com.techelevator;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoMoneyState implements VendingMachineStates {
    VendingMachine vendingMachine;
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    Scanner scanner = new Scanner(System.in);
    private Scanner input = new Scanner(System.in);

    public NoMoneyState(VendingMachine myMachine){
        vendingMachine = myMachine;
    }

    /// methods to be used everywhere
    public void displayMainMenu () throws FileNotFoundException {
        System.out.println("from no money");
        while (true){   // user will still get this menu until he presses 2 or 3.

            System.out.println ("(1) Display Vending Machine Items");
            System.out.println ("(2) Purchase");
            System.out.println ("(3) Exit");
            mainMenuButtonPushed = input.nextLine();

            if (mainMenuButtonPushed.equals("1")){
                vendingMachine.displayItems();
            }
            else if(mainMenuButtonPushed.equals("2")){
                this.displayPurchaseMenu();
                break;
            }
            else{  System.out.println("exiting, thanks for!");
                System.exit(0);
                break;
            }
        }
    }
    @Override
    public void displayPurchaseMenu() throws FileNotFoundException {
        System.out.println("Purchase Menu \n ********************");
        System.out.println ("(1) Feed Money \n (2) Select Product \n (3) Finish Transaction");
        String purchaseMenuButtonPushed = input.nextLine();
        switch (purchaseMenuButtonPushed) {
            case "1":
                vendingMachine.feedMoney();
                break;
            case "2":
                if (vendingMachine.getCurrentMoney()>=0.75){
                    vendingMachine.setVendingMachineState(vendingMachine.getYesHasMoneyState());
                    vendingMachine.vendingMachineState.selectProduct();
             }
                else {
                    this.selectProduct();
                }
                break;
            case "3":
                System.out.println("Would you like to finish this transaction? \n (Y) Yes, I would like to finish my transaction.  \n (N) No, Please take me back to the main menu.");
                String YorN = scanner.nextLine();
                if (!YorN.equalsIgnoreCase("Y") && !YorN.equalsIgnoreCase("N)") ) {
                System.out.println("Invalid Entry");
                displayPurchaseMenu();
                } else if (YorN.equalsIgnoreCase("N")) {
                    displayPurchaseMenu();
                  //  vendingMachine.setVendingMachineState(vendingMachine.getYesHasMoneyState());
                } else {
                    this.finishTransaction();
                }
                break;
        }
    }




    @Override
    public void selectProduct() {
        System.out.println("You have not inserted any money, you cannot select a product.");
    }

    @Override
    public void dispenseProduct(String selectProductIDButtonPushed) {
        System.out.println("You have not inserted any money, I cannot finish this transaction.");
    }

    @Override
    public void finishTransaction() {
        System.out.println("You have not inserted any money, I cannot finish this transaction.");
    }

    @Override
    public void returnMoney() {

    }

    public String getPurchaseMenuButtonPushed() {
        return purchaseMenuButtonPushed;
    }

    public void setPurchaseMenuButtonPushed(String purchaseMenuButtonPushed) {
        this.purchaseMenuButtonPushed = purchaseMenuButtonPushed;
    }

    public String getMainMenuButtonPushed() {
        return mainMenuButtonPushed;
    }

    public void setMainMenuButtonPushed(String mainMenuButtonPushed) {
        this.mainMenuButtonPushed = mainMenuButtonPushed;
    }

    public String getSelectProductIDButtonPushed() {
        return selectProductIDButtonPushed;
    }

    public void setSelectProductIDButtonPushed(String selectProductIDButtonPushed) {
        this.selectProductIDButtonPushed = selectProductIDButtonPushed;
    }

    public int getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(int currentMoneyProvided) {
        this.currentMoneyProvided = currentMoneyProvided;
    }
}
