package com.techelevator;

import com.techelevator.Product.ProductGS;
import com.techelevator.view.Menu;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class VendingMachineMenus {



//    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
//    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
//    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };


    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_EXIT = "Exiting, Thank you.";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT};
    //private static final String hiddenChoice = "4";

    private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
    private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
    private static final String RETURN_TO_MAIN_MENU = "Go back to Main Menu";
    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION, RETURN_TO_MAIN_MENU};

    private static final String ONE_DOLLAR = "$1.00";
    private static final String FIVE_DOLLARS = "$5.00";
    private static final String TEN_DOLLARS = "$10.00";
    private static final String BACK_TO_PURCHASE_MENU = "Go back to Purchase Menu";
    private static final String[] FEED_MONEY_OPTIONS = {ONE_DOLLAR, FIVE_DOLLARS, TEN_DOLLARS, BACK_TO_PURCHASE_MENU};

    private static final String MORE_MONEY_YES = "Y";
    private static final String MORE_MONEY_NO = "N";

    private String selectedProductButton = "";

    private Menu menu;
    VendingMachineFunctions v1 = new VendingMachineFunctions();
    ProductGS productGS = new ProductGS();
    Scanner input = new Scanner(System.in);

    public VendingMachineMenus(Menu menu) throws FileNotFoundException {
        this.menu = menu;
    }

    public VendingMachineMenus() throws FileNotFoundException {
    }

    public void run() throws FileNotFoundException {
        while (true) {
            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
                v1.productObj.printSnackChoices();
                // display vending machine items
            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
                displayPurchaseMenu();
            } else if (choice.equals(MAIN_MENU_EXIT)) {
                System.exit(0);
            }
        }
    }
    public void feedMoney() throws FileNotFoundException {

        while (true) {
            String feedMenu = (String) menu.getChoiceFromOptions(FEED_MONEY_OPTIONS);
            if (feedMenu.equals(ONE_DOLLAR)) {
                v1.addToCustomerAccount(1);
            } else if (feedMenu.equals(FIVE_DOLLARS)) {
                v1.addToCustomerAccount(5);
            } else if (feedMenu.equals(TEN_DOLLARS)) {
                v1.addToCustomerAccount(10);
            } else if (feedMenu.equals(BACK_TO_PURCHASE_MENU)){
                displayPurchaseMenu();
                break;
            }
        }
    }

    public void displayPurchaseMenu() throws FileNotFoundException {
        while (true) {
            String purchaseMenu = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
            if (purchaseMenu.equals(PURCHASE_MENU_FEED_MONEY)) {
                feedMoney();
            } else if (purchaseMenu.equals(PURCHASE_MENU_SELECT_PRODUCT)) {

                v1.productObj.printSnackChoices();
                selectedProductButton = input.nextLine().toUpperCase(Locale.ROOT);
                v1.selectProduct(selectedProductButton);

            } else if (purchaseMenu.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
                v1.finishTransaction();
                run();
            } else if (purchaseMenu.equals(RETURN_TO_MAIN_MENU)) {
                run();
            }
        }
    }

}



//
//package com.techelevator;
//
//import com.techelevator.view.Menu;
//
//import java.io.FileNotFoundException;
//import java.math.BigDecimal;
//import java.text.DecimalFormat;
//import java.util.Locale;
//import java.util.Scanner;

//public class VendingMachineMenus {


//    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
//    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
//    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

//
//    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
//    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
//    private static final String MAIN_MENU_EXIT = "Exit";
//    private static final String HIDDEN = "";
//    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT, HIDDEN};
//    //private static final String hiddenChoice = "4";
//
//    private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
//    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
//    private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
//    private static final String BACK_TO_MAIN_MENU = "Go back to the Main Menu";
//    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION, BACK_TO_MAIN_MENU};
//    private static final String DOLLAR_SIGN = "$";
//    private static final String ONE_DOLLAR = "1.00";
//    private static final String FIVE_DOLLARS = "5.00";
//    private static final String TEN_DOLLARS = "10.00";
//    private static final String BACK_TO_PURCHASE_MENU = "Go back to the Purchase Menu";
//    private static final String[] FEED_MONEY_OPTIONS = {DOLLAR_SIGN + ONE_DOLLAR,DOLLAR_SIGN + FIVE_DOLLARS,DOLLAR_SIGN + TEN_DOLLARS, BACK_TO_PURCHASE_MENU};
//
//    private static final String MORE_MONEY_YES = "Y";
//    private static final String MORE_MONEY_NO = "N";
//
//    private String selectedProductButton = "";
//
//    private Menu menu;
//    VendingMachineFunctions vendingMachineFunctions = new VendingMachineFunctions();
//    Currency currency = new Currency();
//    ProductGS productGS = new ProductGS();
//    Scanner input = new Scanner(System.in);
//
//    public VendingMachineMenus(Menu menu) throws FileNotFoundException {
//        this.menu = menu;
//    }
//
//    public VendingMachineMenus() throws FileNotFoundException {
//    }
//
//    public void run() throws FileNotFoundException {
//        while (true) {
//            System.out.println("Main Menu");
//            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
//            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
//                vendingMachineFunctions.productObj.printSnackChoices();   // display vending machine items
//
//            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
//                displayPurchaseMenu();
//            } else if (choice.equals(MAIN_MENU_EXIT)) {
//                System.out.println("Thank you for using Vend-O-Matic!  Goodbye!");
//                System.exit(0);
//            } else if (choice.equals(HIDDEN)) {
//                System.out.println("Welcome to the hidden secret menu");
//            }
//        }
//    }
//
//    public String displayFeedMoneyMenu() throws FileNotFoundException {
//
//        while(true) {
//            String printFeedMenu = (String) menu.getChoiceFromOptions(FEED_MONEY_OPTIONS);
//
//            if(printFeedMenu.equals(DOLLAR_SIGN + ONE_DOLLAR)) {
//                double customerBalance = currency.customerInsertedCash(ONE_DOLLAR);
//                acceptMoneyFromUser(ONE_DOLLAR, customerBalance);
//
//            } else if (printFeedMenu.equals(DOLLAR_SIGN + FIVE_DOLLARS)) {
//                double customerBalance = currency.customerInsertedCash(FIVE_DOLLARS);
//                acceptMoneyFromUser(FIVE_DOLLARS, customerBalance);
//
//            } else if (printFeedMenu.equals(DOLLAR_SIGN + TEN_DOLLARS)) {
//                double customerBalance = currency.customerInsertedCash(TEN_DOLLARS);
//                acceptMoneyFromUser(TEN_DOLLARS, customerBalance);
//            } else if (printFeedMenu.equals(BACK_TO_PURCHASE_MENU)) {
//                displayPurchaseMenu();
//            }
//        }
//
//    }
//
//    public void acceptMoneyFromUser (String moneyAcceptedFromUser, double customerNewBalance) {
//
//        System.out.printf("%s %s %s %.2f", "Thank you for inserting : $", moneyAcceptedFromUser, " Your new balance is : $", customerNewBalance);
//        ReportsAndLogging.logCustomerInsertedCash(moneyAcceptedFromUser, customerNewBalance);
//
//    }
//
//
//
//    public void displayPurchaseMenu() throws FileNotFoundException {
//        while (true) {
//            String purchaseMenu = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
//            if (purchaseMenu.equals(PURCHASE_MENU_FEED_MONEY)) {
//                displayFeedMoneyMenu();
//
//            } else if (purchaseMenu.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
//                vendingMachineFunctions.productObj.printSnackChoices();
//                selectedProductButton = input.nextLine().toUpperCase(Locale.ROOT);
//                vendingMachineFunctions.selectProduct(selectedProductButton);
//
//            } else if (purchaseMenu.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
//                vendingMachineFunctions.finishTransaction();
//            } else if (purchaseMenu.equals(BACK_TO_MAIN_MENU)) {
//                run();
//            }
//        }
//    }
//
//}
//
//
