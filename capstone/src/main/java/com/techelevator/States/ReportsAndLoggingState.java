package com.techelevator.States;

import com.techelevator.Currency;
import com.techelevator.products.ProductGS;

import java.io.FileNotFoundException;

public class ReportsAndLoggingState implements VendingMachineStates {
    VendingMachine vendingMachine;
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";
    private int currentMoneyProvided = 0;
    ProductGS reportsObject = new ProductGS();

    public ReportsAndLoggingState() {
    }


    @Override
    public void displayMainMenu() throws FileNotFoundException {

    }

    @Override
    public void displayPurchaseMenu() throws FileNotFoundException {

    }

    @Override
    public void selectProduct() throws FileNotFoundException {

    }

    @Override
    public void dispenseProduct(String selectProductIDPushed) throws FileNotFoundException {

    }

    @Override
    public void finishTransaction() {
        System.out.println("reports - finish transaction" );
        if (vendingMachine.getCurrentMoney() >= .05) {
            this.returnMoney();
        } else if(state.getCurrentMoney() == 0) {
            System.out.println("You do not have any change.");
            this.audit();
        }
        // TODO  01/01/2016 12:00:00 PM FEED MONEY: $5.00 $5.00
        // TODO date time PM Crunchie B4 $10.00 $8.50
        // TODO  Customer returned Money Quarter, Dime

        // TODO Machine Balance Update to 0

        // TODO return user to main menu

        // TODO Audit -- Create log


    }

    @Override
    public void returnMoney() {

    }



    public void audit() {
        // TODO unit tests


        //    public static void log (String message) {
//        String logFile = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\module-1-pair-programming" +
//                "-4\\exercise\\logs\\search.log";
//        File searchLogFile = new File(logFile);
//        try (PrintWriter exceptionLog = new PrintWriter(new FileOutputStream(searchLogFile, true))){
//            LocalDate date = LocalDate.now();
//            exceptionLog.println(date);
//            exceptionLog.println(message);
//            exceptionLog.close();
//        } catch (FileNotFoundException e) {
//            System.out.println(e + "An error has occured (TELog class)");
//        }
//    }


//  	TELog.log(indexedWordsToString());


    }


    public void calculateChange() {
        double numOfNickels = 0;
        double numOfDimes = 0;
        double numOfQuarters = 0;

        double total = vendingMachine.getCurrentMoney();

        numOfQuarters = total / Currency.QUARTER.getValue();
        total %= Currency.QUARTER.getValue();
        numOfDimes = total / Currency.DIME.getValue();
        total %= Currency.DIME.getValue();
        numOfNickels = total / Currency.NICKEL.getValue();
        total %= Currency.NICKEL.getValue();

        System.out.println("Your change: " + numOfQuarters + " Quarters, " + numOfDimes + " Dimes, and " + numOfNickels + " Nickels.");

    }

}
