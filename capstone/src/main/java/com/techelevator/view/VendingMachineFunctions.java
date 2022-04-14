package com.techelevator.view;

import java.util.Scanner;

public class VendingMachineFunctions {
    private double currentMoneyProvided = 00.00;
    Scanner input = new Scanner(System.in);

    public void feedMoney(int moneyChoice) {
        switch (moneyChoice) {
            case (1):
                setCurrentMoneyProvided(1.00 + getCurrentMoneyProvided());
                break;
            case (5):
                setCurrentMoneyProvided(5.00 + getCurrentMoneyProvided());
                break;
            case (10):
                setCurrentMoneyProvided(10.00 + getCurrentMoneyProvided());
                break;
        }

        System.out.printf("%s %.2f%n",  "Your balance is $", getCurrentMoneyProvided());
//        switch(moreCashYorN) {
//            case(moreCash.equalsIgnoreCase("Y")) :
//
//        }


    }

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(double currentMoneyProvided) {
        this.currentMoneyProvided = currentMoneyProvided;
    }
}
