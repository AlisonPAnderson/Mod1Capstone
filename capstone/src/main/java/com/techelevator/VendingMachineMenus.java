package com.techelevator;

import com.techelevator.view.Menu;
import com.techelevator.view.VendingMachineFunctions;

public class VendingMachineMenus {


    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
    private static final String MAIN_MENU_EXIT = "Exiting, Thank you.";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT};
    //private static final String hiddenChoice = "4";

    private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
    private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
    private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
    private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};

    private static final String ONE_DOLLAR = "$1.00";
    private static final String FIVE_DOLLARS = "$5.00";
    private static final String TEN_DOLLARS = "$10.00";
    private static final String BACK_TO_PURCHASE_MENU = "I am finished feeding Cash, Back to Purchase Menu";
    private static final String[] FEED_MONEY_OPTIONS = {ONE_DOLLAR, FIVE_DOLLARS, TEN_DOLLARS, BACK_TO_PURCHASE_MENU};

    private static final String MORE_MONEY_YES = "Y";
    private static final String MORE_MONEY_NO = "N";

    private Menu menu;
    VendingMachineFunctions v1 = new VendingMachineFunctions();

    public VendingMachineMenus(Menu menu) {
        this.menu = menu;
    }

    public void feedMoney() {

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

    public void displayPurchaseMenu() {
        while (true) {

            String purchaseMenu = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
            if (purchaseMenu.equals(PURCHASE_MENU_FEED_MONEY)) {
                feedMoney();
            } else if (purchaseMenu.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
                //TODO print vending machine items (again)
                //TODO dispense, sound, update balance
            } else if (purchaseMenu.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
                // TODO Finish transaction update balance
                //TODO give change
                //TODO logging
            }
        }
    }






}


