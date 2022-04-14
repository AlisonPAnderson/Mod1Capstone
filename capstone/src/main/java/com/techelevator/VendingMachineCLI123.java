package com.techelevator;

import com.techelevator.view.Menu;

import java.io.FileNotFoundException;

public class VendingMachineCLI123 {
//
//    private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
//    private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
//    private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE };

  //  private Menu menu;


//
//    public VendingMachineCLI123(Menu menu) throws FileNotFoundException {
//        this.menu = menu;
//    }

//    public void run() throws FileNotFoundException {
//        while (true) {
//            String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
//
//            if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
//                productGS = new ProductGS();
//                productGS.printSnackChoices();
//                // display vending machine items
//            } else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
//                purchaseMenu = new VendingMachineMenus(menu);
//                purchaseMenu.displayPurchaseMenu();
//            }
//        }
//    }

    public static void main(String[] args) throws FileNotFoundException {

      Menu menu = new Menu(System.in, System.out);
        VendingMachineMenus runMainMenu = new VendingMachineMenus(menu);
      //  VendingMachineCLI123 cli = new VendingMachineCLI123(menu);
        runMainMenu.run();
       // cli.run();
    }
}



