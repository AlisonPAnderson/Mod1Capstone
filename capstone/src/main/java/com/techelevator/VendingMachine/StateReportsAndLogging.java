package com.techelevator.VendingMachine;

import java.util.Scanner;

public class StateReportsAndLogging extends AbstractVendingMachine{
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    private Scanner input = new Scanner(System.in);

    ContextVendingMachine myMachine;

    public StateReportsAndLogging(ContextVendingMachine contextVendingMachine) {
        this.myMachine = contextVendingMachine;
    }
}


