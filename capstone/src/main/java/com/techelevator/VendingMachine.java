package com.techelevator;
import com.techelevator.products.Product;
import com.techelevator.products.ProductGS;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
    //// variables
    private Scanner input = new Scanner(System.in);
    //machine object (so we can keep working with the same object)
    VendingMachineStates vendingMachineState;
    ProductGS productsObj = new ProductGS();
    String itemID = "";

    Map<String, Product> productsMap = productsObj.buildMenu();
    ///current money
    private double currentMoney=00.00;
    private double returnMoney = 00.00;

    public void setCurrentMoney(double currentMoney) {
        this.currentMoney = currentMoney;
    }

    public void setReturnMoney(double returnMoney) {
        this.returnMoney = returnMoney;
    }

    public double getReturnMoney() {
        return returnMoney;
    }

    public double getCurrentMoney() {
        return currentMoney;
    }
    public void addMoney(double moneyToAdd) {
        this.currentMoney +=moneyToAdd;
    }
    ////////////////

    //// machine states
    VendingMachineStates noMoneyState;
    VendingMachineStates hasMoneyState;
    VendingMachineStates dispensingState;
    VendingMachineStates reportsAndLoggingState;

    // empty and loaded constructors
    public VendingMachine() throws FileNotFoundException {
        hasMoneyState = new HasMoneyState(this);
        noMoneyState = new NoMoneyState(this);
       // dispensingState = new DispensingState(this);
       vendingMachineState = noMoneyState;
    }

    /// set states ( we use one of the change states methods (ex:GetYesNoMoneyState) as a parameter.
    void setVendingMachineState (VendingMachineStates newVendingMachineState){
        this.vendingMachineState = newVendingMachineState;
    }

    //// change states
    public VendingMachineStates getYesNoMoneyState () {
        return noMoneyState;
    }
    public VendingMachineStates getYesHasMoneyState () {
        return hasMoneyState;
    }
    public VendingMachineStates getYesReportsAndLoggingState () {return reportsAndLoggingState;};

    ///get current state
    public VendingMachineStates getCurrentState () {
        return vendingMachineState;
    }


    /// simple methode to print the menu of the machine's items /// can be customized from productGS class
       void displayItems(){
        productsObj.printMenu();
        }

       void dispensing(String selectProductIDButtonPushed) throws FileNotFoundException {
        productsObj.dispense(selectProductIDButtonPushed); }




        ///
    public void feedMoney() throws FileNotFoundException {
        while (true){
            System.out.println("Please choose how much money to insert  test");
            System.out.println ("(1) $1.00");
            System.out.println ("(5) $5.00");
            System.out.println ("(10) $10.00");
            System.out.printf("Current Money Provided: $" + "%.2f%n", this.getCurrentMoney());

            String moneyChoice = input.nextLine();

            //////// calling adding money method
            if (Integer.parseInt(moneyChoice)==1 || Integer.parseInt(moneyChoice)==5 || Integer.parseInt(moneyChoice)==10 ){
                addMoney(Double.parseDouble(moneyChoice));
            }

            System.out.printf("Current Money Provided: $"+ "%.2f%n", this.getCurrentMoney()  );


            System.out.println("Would you like to insert more money? (Y/N)");
            String YorN = input.nextLine();
            /// while loop will not exit until user press n or N.
            if (YorN.equalsIgnoreCase("n")) {
                System.out.printf("Current Money Provided: $"+ "%.2f%n", this.getCurrentMoney());
                hasMoneyState.displayPurchaseMenu();
                break;
            }
            // updated money provided
            System.out.printf("Current Money Provided: $"+ "%.2f%n", this.getCurrentMoney());
        }///while ends

    }/// feed money method ends

    public void displayMainMenu() throws FileNotFoundException {
        vendingMachineState.displayMainMenu();
    }


}
