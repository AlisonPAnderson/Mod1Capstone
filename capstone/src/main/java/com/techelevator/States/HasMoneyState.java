package com.techelevator;

import com.techelevator.products.ProductGS;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class HasMoneyState implements VendingMachineStates {
    private Scanner input = new Scanner(System.in);
    private String purchaseMenuButtonPushed = "";
    private String mainMenuButtonPushed = "";
    private String selectProductIDButtonPushed = "";

    VendingMachine vendingMachine;
    ProductGS hasMoneyObject = new ProductGS();

    public HasMoneyState(VendingMachine myMachine){
        vendingMachine = myMachine;
    }

    public HasMoneyState() {
    }

    /// methods to be used everywhere
    public void displayMainMenu () throws FileNotFoundException {
        System.out.println("from has money");
        while (true){   // user will still get this menu until he presses 2 or 3.

            System.out.println ("(1) Display Vending Machine Items");
            System.out.println ("(2) Purchase");
            System.out.println ("(3) Exit");
            String mainMenuButtonPushed = input.nextLine();

            if (mainMenuButtonPushed.equals("1")){
               vendingMachine.displayItems();
            }
            else if(mainMenuButtonPushed.equals("2")){
                this.displayPurchaseMenu();
                break;
            }
            else{  System.out.println("exiting, thanks for!");
                System.exit(0);
                break;
            }
        }
    }

    @Override
    public void displayPurchaseMenu() throws FileNotFoundException {
        System.out.println("we are running from Has money state");
         System.out.println ("(1) Feed Money");
        System.out.println ("(2) Select Product");
        System.out.println ("(3) Finish Transaction");
        String purchaseMenuButtonPushed = input.nextLine();
        switch (purchaseMenuButtonPushed) {
            case "1":
                vendingMachine.feedMoney();
                break;
            case "2":
                if (vendingMachine.getCurrentMoney()>=0.75){
                    vendingMachine.setVendingMachineState(vendingMachine.getYesNoMoneyState());

                }
                    vendingMachine.vendingMachineState.selectProduct();

                break;
            case "3":

                vendingMachine.setVendingMachineState(vendingMachine.getYesReportsAndLoggingState());
                vendingMachine.vendingMachineState.finishTransaction();

                }

        }


    @Override
    public void selectProduct() throws FileNotFoundException {
        vendingMachine.displayItems();
        System.out.println(" ");
        System.out.println("Please enter a valid product ID: ");
        String selectProductIDButtonPushed = input.nextLine();

        ///when the item code is correct
        if (vendingMachine.productsMap.containsKey(selectProductIDButtonPushed)) {

            if (vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() > 0) {
                this.dispenseProduct(selectProductIDButtonPushed);
            } else if (vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() <=0){
                System.out.println("item is out of stock");
                this.displayPurchaseMenu();
            }
        }
        //// when the item code is not correct:
         else {
            System.out.println("You have entered an invalid code.  Please enter a valid product ID");
            this.displayPurchaseMenu();
        }




    }
    public void customerTab(double wallet) {

    }

    @Override
    public void dispenseProduct(String selectProductIDButtonPushed) throws FileNotFoundException {
        System.out.println("getting the item" + selectProductIDButtonPushed+ " successfully");

        vendingMachine.productsMap.get(selectProductIDButtonPushed).reduceQuantity();

        vendingMachine.setCurrentMoney(vendingMachine.getCurrentMoney() - vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice());

        System.out.printf("%s %s $%,.2f\n", "You chose: ",vendingMachine.productsMap.get(selectProductIDButtonPushed).getName(), vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice()   );

        System.out.printf("%s $%,.2f\n", "Your updated balance is: ", vendingMachine.getCurrentMoney());

        System.out.printf("%s %d\n", "Quantity Remaining: ",vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() );


       // System.out.println("the new current money" +( vendingMachine.getCurrentMoney() - vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice()));

        System.out.println();
        hasMoneyObject.dispense(selectProductIDButtonPushed);

        System.out.println("Would you like anything else?");


        this.displayPurchaseMenu();




    }

    @Override
    public void finishTransaction() {


    }

    @Override
    public void returnMoney() {

    }

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

}
//        System.out.printf("%s %s $%,.2f %s $%.2f %d\n", "You chose : ", vendingMachine.productsMap.get(selectProductIDButtonPushed).getName(), vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice(),"Your updated balance is: ",vendingMachine.getCurrentMoney() - vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice(), vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity());