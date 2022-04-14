package com.techelevator.VendingMachine;

import java.util.Scanner;

public class StateDispensing extends AbstractVendingMachine{
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    private Scanner input = new Scanner(System.in);

    ContextVendingMachine myMachine;

    public StateDispensing(ContextVendingMachine contextVendingMachine) {
        this.myMachine = contextVendingMachine;
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

    public ContextVendingMachine getMyMachine() {
        return myMachine;
    }

    public void setMyMachine(ContextVendingMachine myMachine) {
        this.myMachine = myMachine;
    }
}
