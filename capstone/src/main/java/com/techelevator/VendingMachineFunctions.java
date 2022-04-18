package com.techelevator;
import com.techelevator.Product.Product;
import com.techelevator.Product.ProductGS;

import java.lang.reflect.Array;
import java.util.Map;

public class VendingMachineFunctions {

    private double Total_Sales = 0.00;
    private double currentMoneyProvided = 00.00;
    ProductGS productObj = new ProductGS();
    private Map<String, Product> vendingMachineMap = productObj.buildMenu();




    public VendingMachineFunctions() {
    }

    public double addToCustomerAccount(int moneyChoice) {
        switch (moneyChoice) {
            case(1):
                setCurrentMoneyProvided(1.00 + getCurrentMoneyProvided());
                break;
            case (5):
                setCurrentMoneyProvided(5.00 + getCurrentMoneyProvided());
                break;
            case (10):
                setCurrentMoneyProvided(10.00 + getCurrentMoneyProvided());
                break;
        }
        System.out.printf("%s %.2f%n",   "Your Balance is  $", getCurrentMoneyProvided());
        ReportsAndLogging.log("FEED MONEY : $" + (double)moneyChoice + "  RUNNING BALANCE : $" + this.getCurrentMoneyProvided());
    return getCurrentMoneyProvided();
    }

    public String[] selectProduct(String itemChoiceFromUser)  {
        String logMessage = "";
        double productPrice = this.vendingMachineMap.get(itemChoiceFromUser).getPrice();
        //String productPriceString = String.valueOf(productPrice);
        //String productType = this.vendingMachineMap.get(itemChoiceFromUser).getClass().getSimpleName();
        //String productName = this.vendingMachineMap.get(itemChoiceFromUser).getName();
        //String productID = itemChoiceFromUser;
        String[] customerItemChoice = new String[4];

        if (!(this.vendingMachineMap.containsKey(itemChoiceFromUser))) {
            System.out.println("We're sorry, " + itemChoiceFromUser + " is not a valid item ID");
        } else {
            if (!(this.getCurrentMoneyProvided() >= productObj.getItemPrice())) {
                System.out.println("We're sorry, insufficent funds for this purchase.  Please insert more cash.");
            } else if (!(this.vendingMachineMap.get(itemChoiceFromUser).getQuantity() >= 1)) {
                System.out.println("We're sorry, insufficent stock for this purchase.  Please choose another item.");
            } else {
                String productID = itemChoiceFromUser;
                String productName = this.vendingMachineMap.get(itemChoiceFromUser).getName();
                String productType = this.vendingMachineMap.get(itemChoiceFromUser).getClass().getSimpleName();
               // String productSound = this.vendingMachineMap.get(itemChoiceFromUser).sound();
               productPrice = this.vendingMachineMap.get(itemChoiceFromUser).getPrice();

                productID = itemChoiceFromUser;
                String productSound = this.vendingMachineMap.get(itemChoiceFromUser).sound();
                String customerBalance = String.valueOf(this.getCurrentMoneyProvided());
                    logMessage.format("%5s %5s %.2f", itemChoiceFromUser, productName, productPrice  );
// "" - " + itemChoiceFromUser + "-" + productName + ": $" + productPrice + " ---" ;
                    this.vendingMachineMap.get(itemChoiceFromUser).reduceQuantity();
                    this.setCurrentMoneyProvided(this.getCurrentMoneyProvided() - productPrice);
                    this.addToTotalSales(productPrice);

                System.out.printf("%s %.2f %s %.2f \n \n %s %s %s %s \n %s",
                "The total for all of your items is: $", this.getTotalSales(),
                "     Your remaining balance is: $", this.getCurrentMoneyProvided(),
                "Dispensing the item: ", productName, "- Enjoy your ", productType, productSound);
                String logMessage2 = "";
               // logMessage2.format("%5s %5s %.2f", logMessage, "Updated Customer Balance: $", this.getCurrentMoneyProvided());
                ReportsAndLogging.log( logMessage + "  Updated Customer Balance: $" + this.getCurrentMoneyProvided());
               // ReportsAndLogging.log(logMessage + logMessage2);
            }
        }
        return customerItemChoice;
    }

    public void finishTransaction() {
        String change = "" + this.getCurrentMoneyProvided();

        if(!(this.getCurrentMoneyProvided()>=0.05)) {
            System.out.println("We're sorry, insufficent funds.");
        } else {
            Currency my = new Currency();
            my.getChangeInCoins(this.getCurrentMoneyProvided());
            this.setBalanceToZero();
            System.out.println("Thank you for your business!");
            ReportsAndLogging.log("GIVE CHANGE: $" + change + " $" + this.getCurrentMoneyProvided());
        }
    }

    public void setBalanceToZero() {
        this.currentMoneyProvided = 00.00;
    }

    public void addToTotalSales(double priceToAdd) {
        this.Total_Sales += priceToAdd;
    }

    public double getTotalSales() {
        return this.Total_Sales;
    }

    public Map<String, Product> getVendingMachineMap() {
        return vendingMachineMap;
    }

    public double getCurrentMoneyProvided() {
        return currentMoneyProvided;
    }

    public void setCurrentMoneyProvided(double currentMoneyProvided) {
        this.currentMoneyProvided = currentMoneyProvided;
    }
}




