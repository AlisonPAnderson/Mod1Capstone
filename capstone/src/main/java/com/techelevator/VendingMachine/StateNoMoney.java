package com.techelevator.VendingMachine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class NoMoneyState extends VendingMachineAbstract {
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    private Scanner input = new Scanner(System.in);
    ContextVendingMachine myMachine;

    public NoMoneyState(ContextVendingMachine myMachine) {
        this.myMachine = myMachine;
    }

    @Override
    public String getStateDescription() {
        return "before you have inserted cash";
    }

    public void displayMainMenu () throws FileNotFoundException {
        System.out.println("from no money");
        while (true){   // user will still get this menu until he presses 2 or 3.

            System.out.println ("(1) Display Vending Machine Items");
            System.out.println ("(2) Purchase");
            System.out.println ("(3) Exit");
            mainMenuButtonPushed = input.nextLine();

            if (mainMenuButtonPushed.equals("1")){
                myMachine.displayItems();
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










    // Getters and Setters

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
