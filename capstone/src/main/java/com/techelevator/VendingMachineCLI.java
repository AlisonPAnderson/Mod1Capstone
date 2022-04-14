//package com.techelevator;
//
//import com.techelevator.view.Menu;
//import com.techelevator.view.VendingMachineFunctions;
//
//import java.util.Scanner;
//
//public class VendingMachineCLI {
//	Scanner input = new Scanner(System.in);
//	private Menu menu;
//
//	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
//	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
//	private static final String MAIN_MENU_EXIT = "Exiting, Thank you.";
//
//	private static final String[] MAIN_MENU_OPTIONS = { MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_EXIT };
//	//private static final String hiddenChoice = "4";
//
//	private static final String PURCHASE_MENU_FEED_MONEY = "Feed Money";
//	private static final String PURCHASE_MENU_SELECT_PRODUCT = "Select Product";
//	private static final String PURCHASE_MENU_FINISH_TRANSACTION = "Finish Transaction";
//	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_FEED_MONEY, PURCHASE_MENU_SELECT_PRODUCT, PURCHASE_MENU_FINISH_TRANSACTION};
//
//	private static final String ONE_DOLLAR = "$1.00";
//	private static final String FIVE_DOLLARS = "$5.00";
//	private static final String TEN_DOLLARS ="$10.00";
//	private static final String[] FEED_MONEY_OPTIONS = {ONE_DOLLAR, FIVE_DOLLARS, TEN_DOLLARS};
//
//	private static final String MORE_MONEY_YES = "Y";
//	private static final String MORE_MONEY_NO = "N";
//
//
//
//	public VendingMachineCLI(Menu menu) {
//		this.menu = menu;
//	}
//VendingMachineFunctions v1 = new VendingMachineFunctions();
//	public void run() {
//		while (true) {
//			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
//			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
//				// TODO Move Product classes Over
//				//TODO print vending machine item,s
//
//			//	displayMenuItems();
//			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
//
//				while (true){
//					String purchaseMenu = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
//					if (purchaseMenu.equals(PURCHASE_MENU_FEED_MONEY)) {
//						String feedMenu = (String) menu.getChoiceFromOptions(FEED_MONEY_OPTIONS);
//						if (feedMenu.equals(ONE_DOLLAR)) {
//							v1.feedMoney(1);
//						}
//						else if (feedMenu.equals(FIVE_DOLLARS)) {
//							v1.feedMoney(5);
//						}
//						else if (feedMenu.equals(TEN_DOLLARS)) {
//							v1.feedMoney(10);
//						}
//
//					} else if (choice.equals(PURCHASE_MENU_SELECT_PRODUCT)) {
//						break;
//						//TODO print vending machine items (again)
//						//TODO dispense, sound, update balance
//
//
//					} else if (choice.equals(PURCHASE_MENU_FINISH_TRANSACTION)) {
//						break;
//						// TODO Finish transaction update balance
//						//TODO give change
//						//TODO logging
//
//					}
//
//				}
//
//			} else if (choice.equals(MAIN_MENU_EXIT)) {
//				break;
//			}
//		}
//	}
//
//
//
//// TODO testing
//	//TODO exceptions
//	// TODO Powerpoint
//
//
//
//
//
//	public static void main(String[] args) {
//		Menu menu = new Menu(System.in, System.out);
//		VendingMachineCLI cli = new VendingMachineCLI(menu);
//
//
//			cli.run();
//
//	}
//}