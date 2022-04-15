//package com.techelevator;
//
//import java.io.FileNotFoundException;
//import java.util.Map;
//import java.util.Scanner;
//
//public class VendingMachineFunctions {
//    private static double Total_Sales= 0.00;
//    private double currentMoneyProvided = 00.00;
//
//    ProductGS productObj = new ProductGS();
//    private Map<String, Product> vendingMachineMap= productObj.buildMenu();
//
//    Scanner input = new Scanner(System.in);
//
//    public VendingMachineFunctions() throws FileNotFoundException {
//    }
//
//
//    public void addToCustomerAccount(int moneyChoice) {
//        String logMessage ="FEED MONEY:  $"+ getCurrentMoneyProvided();
//        switch (moneyChoice) {
//            case (1):
//                setCurrentMoneyProvided(1.00 + getCurrentMoneyProvided());
//                break;
//            case (5):
//                setCurrentMoneyProvided(5.00 + getCurrentMoneyProvided());
//                break;
//            case (10):
//                setCurrentMoneyProvided(10.00 + getCurrentMoneyProvided());
//                break;
//        }
//        System.out.printf("%s %.2f%n",  "Your balance is $", getCurrentMoneyProvided());
//        ReportsAndLogging.log(logMessage+"  Running Balance: $"+ this.getCurrentMoneyProvided());   // creates an overwritten log of each money insert, and product purchase
//    }
//
//
//    public void selectProduct(String itemChoiceFromUser){
//
//        String logMessage = "";
//        //check if the item id is valid (check if "itemChoiceFromUser" is a valid key (item id ex:"A1")
//        if (!(this.vendingMachineMap.containsKey(itemChoiceFromUser))){
//            System.out.println("Sorry! " + itemChoiceFromUser + " is not a valid item Id");
//        }
//
//        else {//// the item id entered is valid
//            /// check if the machine has enough money to buy the selected item
//            if (!(this.getCurrentMoneyProvided() >= this.vendingMachineMap.get(itemChoiceFromUser).getPrice())){
//                System.out.println("Sorry! you don't have enough Money, Please feed the machine");
//            }
//            /// check if the item is available
//            else if (!(this.vendingMachineMap.get(itemChoiceFromUser).getQuantity()>=1)){
//                System.out.println("Sorry! out of stock");
//            }
//            /// the id is valid + the machine has money + the item is available {the purchase is happening }
//            else {
//                int quantityRemaining = 0;
//                String productID = itemChoiceFromUser;
//                String productName = this.vendingMachineMap.get(itemChoiceFromUser).getName();
//                String productType = this.vendingMachineMap.get(itemChoiceFromUser).getClass().getSimpleName();
//                String productSound = this.vendingMachineMap.get(itemChoiceFromUser).sound();
//                double productPrice = this.vendingMachineMap.get(itemChoiceFromUser).getPrice();
//
//
//                ///item id + machine balance before the purchase
//                logMessage += itemChoiceFromUser+ " $" + this.getCurrentMoneyProvided();
//                /// reducing quantity
//                this.vendingMachineMap.get(itemChoiceFromUser).reduceQuantity();
//                /// spending money ( current machine balance - the price of the selected item
//                this.setCurrentMoneyProvided(this.getCurrentMoneyProvided() - productPrice);
//
//                // a message to thank the user & sound
//                System.out.printf("%s %.2f %s %.2f \n \n %s %s %s %s \n %s", "Your total was: $", productPrice, "      Your remaining balance is: $", this.getCurrentMoneyProvided(), "Dispensing the item: ", productName , "-  Enjoy your ", productType, productSound);
//                //      System.out.println("Your total was: " + productPrice + "     Your remaining balance is: " + );
//
//                //////////////////////
//                /// log + reports
//                ////////////////////
//                //adding the amount to the total sales
//                this.addToTotalSales(productPrice);
//                ///log item id + old balance + new balance
//                ReportsAndLogging.log(logMessage+" $"+ this.getCurrentMoneyProvided());
//                ReportsAndLogging.getSalesReports(55.00);
//            }
//        }
//
//
//    }///selectProduct method end
//
//
//    public void finishTransaction(){
//        /// all what this method can do is to return the remained money if there is any, or print a message "no money to be returned"
//        if (!(this.getCurrentMoneyProvided()>=0.05)){
//            System.out.println("Sorry! unable to process - No Money remained");
//        }
//        else { /// return the remaining change
//            // creating a currency obj to use getChangeCoins method.
//            Currency my = new Currency();
//            my.getChangeInCoins(this.getCurrentMoneyProvided());
//            // updating the current balance =>0
//            this.setBalanceToZero();
//            System.out.println("Thank you for your shopping!");
//        }
//
//    }/// finishTransaction method end
//
//
//
//    //TODO still working on it
//    public void getSales(){
//        for (Map.Entry<String,Product> item:vendingMachineMap.entrySet()){
//            String message = item.getValue().getName()+"|"+item.getValue().getQuantity();
//        }
//    }
//
//    public double getTotalSales(){
//        return Total_Sales;
//    }
//    public void addToTotalSales( double priceToAdd){
//        this.Total_Sales += priceToAdd;
//    }
//
//    public double getCurrentMoneyProvided() {
//        return currentMoneyProvided;
//    }
//
//    public void setCurrentMoneyProvided(double currentBalance) {
//        this.currentMoneyProvided = currentBalance;
//    }
//    public void setBalanceToZero(){
//        this.currentMoneyProvided=00.00;
//    }
//
//
//
//}



package com.techelevator;

//import com.techelevator.SalesReports.Sales;

import com.techelevator.Product.Product;
import com.techelevator.Product.ProductGS;

import java.io.FileNotFoundException;
import java.util.Map;

public class VendingMachineFunctions {
    private double Total_Sales= 0.00;
    private double currentMoneyProvided = 00.00;
    private int quantity=0;

    ProductGS productObj = new ProductGS();
    private Map<String, Product> vendingMachineMap= productObj.buildMenu();

    public Map<String, Product> getVendingMachineMap() {
        return vendingMachineMap;
    }

    public VendingMachineFunctions() throws FileNotFoundException {
    }


    public void addToCustomerAccount(int moneyChoice) {
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
        ReportsAndLogging.log("FEED MONEY : $"+(double)moneyChoice +" RUNNING BALANCE : $"+ this.getCurrentMoneyProvided());
        // creates an overwritten log of each money insert, and product purchase
    }


    public void selectProduct(String itemChoiceFromUser)  {

        String logMessage = "";
        //check if the item id is valid (check if "itemChoiceFromUser" is a valid key (item id ex:"A1")
        if (!(this.vendingMachineMap.containsKey(itemChoiceFromUser))){

            System.out.println("Sorry! " + itemChoiceFromUser + " is not a valid item Id");
        }

        else {//// the item id entered is valid
            /// check if the machine has enough money to buy the selected item
            if (!(this.getCurrentMoneyProvided() >= this.vendingMachineMap.get(itemChoiceFromUser).getPrice())){
                System.out.println("Sorry! you don't have enough Money, Please feed the machine");
            }
            /// check if the item is available
            else if (!(this.vendingMachineMap.get(itemChoiceFromUser).getQuantity()>=1)){

                System.out.println("Sorry! out of stock, Please choose another product");
            }
            /// the id is valid + the machine has money + the item is available {the purchase is happening }
            else {

                String productID = itemChoiceFromUser;
                String productName = this.vendingMachineMap.get(itemChoiceFromUser).getName();
                String productType = this.vendingMachineMap.get(itemChoiceFromUser).getClass().getSimpleName();
                String productSound = this.vendingMachineMap.get(itemChoiceFromUser).sound();
                double productPrice = this.vendingMachineMap.get(itemChoiceFromUser).getPrice();



                logMessage += " - " + itemChoiceFromUser+ " " + productName + " " + "---" +  " $" + this.getCurrentMoneyProvided();    ///item id + machine balance before the purchase
                /// reducing quantity
                this.vendingMachineMap.get(itemChoiceFromUser).reduceQuantity();
                this.setCurrentMoneyProvided(this.getCurrentMoneyProvided() - productPrice);      /// spending money ( current machine balance - the price of the selected item
                this.addToTotalSales(productPrice);      /// storing the amount to the total sales

                // a message to thank the user & sound
                System.out.printf("%s %.2f %s %.2f \n \n %s %s %s %s \n %s", "The total for all of your items is: $", this.getTotalSales(), "      Your remaining balance is: $", this.getCurrentMoneyProvided(), "Dispensing the item: ", productName , "-  Enjoy your ", productType, productSound);
                //      System.out.println("Your total was: " + productPrice + "     Your remaining balance is: " + );

                //////////////////////
                /// log + reports
                ////////////////////

                ///log item id + old balance + new balance
                ReportsAndLogging.log(logMessage+" $"+ this.getCurrentMoneyProvided());
            }
        }


    }///selectProduct method end


    public void finishTransaction(){
        String change = ""+this.getCurrentMoneyProvided();
        /// all what this method can do is to return the remained money if there is any, or print a message "no money to be returned"
        if (!(this.getCurrentMoneyProvided()>=0.05)){
            System.out.println("Sorry! unable to process - No Money remained");
        }
        else { /// return the remaining change
            // creating a currency obj to use getChangeCoins method.
            Currency my = new Currency();
            my.getChangeInCoins(this.getCurrentMoneyProvided());
            //// log the change

            // updating the current balance =>0
            this.setBalanceToZero();
            System.out.println("Thank you for your shopping!");
            ReportsAndLogging.log("GIVE CHANGE: $"+change+ " $"+this.getCurrentMoneyProvided());



        }

    }/// finishTransaction method end



    //TODO still working on it

//    public void getSales(){
//        Sales sales =  new Sales();
//        File tempFile = new File("capstone/src/main/java/com/techelevator/SalesReports/temp.txt");
//        boolean exists = tempFile.exists();
//    if (!exists){
//        sales.makeTemp();
//    }
//    sales.tempMap();
//   sales.getSalesReports();
//
//
//    }

    public double getTotalSales(){
        return this.Total_Sales;
    }
    public void addToTotalSales( double priceToAdd){
        this.Total_Sales += priceToAdd;
    }

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(double currentBalance) {
        this.currentMoneyProvided = currentBalance;
    }
    public void setBalanceToZero(){
        this.currentMoneyProvided=00.00;
    }



}