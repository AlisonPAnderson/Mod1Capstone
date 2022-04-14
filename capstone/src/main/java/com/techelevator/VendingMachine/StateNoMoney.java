package com.techelevator.VendingMachine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class StateNoMoney extends AbstractVendingMachine {
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    private Scanner input = new Scanner(System.in);

    ContextVendingMachine myMachine;

    public StateNoMoney(ContextVendingMachine contextVendingMachine) {
        this.myMachine = myMachine;
    }

    public StateNoMoney() {
    }

    @Override
    public void feedMoney() {

    }

    //
//    @Override
//    public String getStateDescription() {
//        return "before you have inserted cash";
//    }

//
//    public void displayMainMenu () throws FileNotFoundException {
//
//            PrintMenus.printMainMenu();                        // print main menu
//            mainMenuButtonPushed = input.nextLine();
//            if (mainMenuButtonPushed.equals("1")){
//              myMachine.productsObj.buildMenu();  // Display Products
//            }
//            else if(mainMenuButtonPushed.equals("2")){
//                PrintMenus.printPurchaseMenu();
//
//            }
//            else{  System.out.println("exiting, thanks for!");
//                System.exit(0);
//
//            }
//
//        }


    public void displayPurchaseMenu() {
     PrintMenus.printPurchaseMenu();

     String purchaseMenuButtonPushed = input.hasNextLine();

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
