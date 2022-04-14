package com.techelevator.VendingMachine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControlVendingMachine extends AbstractVendingMachine {
    Scanner input = new Scanner(System.in);
    private double currentMoney = 00.00;
    private double returnMoney = 00.00;


    public void addMoney(double moneyToAdd) {
        this.currentMoney += moneyToAdd;
    }


    public void feedMoney() {
        while (true) {
            System.out.println("Please choose how much money to insert  test");
            System.out.println("(1) $1.00 \n(5) $5.00 \n(10) $10.00");
            System.out.printf("Current Money Provided: $" + "%.2f%n", this.getCurrentMoney());

            String moneyChoice = input.nextLine();

            //////// calling adding money method
            if (Integer.parseInt(moneyChoice) == 1 || Integer.parseInt(moneyChoice) == 5 || Integer.parseInt(moneyChoice) == 10) {
                addMoney(Double.parseDouble(moneyChoice));
            }

            System.out.printf("Current Money Provided: $" + "%.2f%n", this.getCurrentMoney());

            System.out.println("Would you like to insert more money? (Y/N)");
            String YorN = input.nextLine();
            /// while loop will not exit until user press n or N.
            if (YorN.equalsIgnoreCase("n")) {
                System.out.printf("Current Money Provided: $" + "%.2f%n", this.getCurrentMoney());

                ContextVendingMachine.getStateHasMoney();

                PrintMenus.printPurchaseMenu();

                break;
            }
            // updated money provided
            System.out.printf("Current Money Provided: $" + "%.2f%n", this.getCurrentMoney());
        }///while ends

    }/// feed money method ends




    public void setCurrentMoney(double newCurrentMoney) {
        this.currentMoney = newCurrentMoney;
    }


    public double getCurrentMoney() {
        return currentMoney;
    }






}