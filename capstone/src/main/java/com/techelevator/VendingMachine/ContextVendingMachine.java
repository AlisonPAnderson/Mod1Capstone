package com.techelevator.VendingMachine;

import com.techelevator.products.Product;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class ContextVendingMachine extends AbstractVendingMachine {
    private Scanner input = new Scanner(System.in);
    ProductGS productsObj = new ProductGS;
    private AbstractVendingMachine state;
    private double currentMoney = 00.00;
    private double returnMoney = 00.00;
    Map<String, Product> productsMap = productsObj.buildMenu();
    AbstractVendingMachine stateNoMoney;
    AbstractVendingMachine stateHasMoney;
    AbstractVendingMachine stateDispensing;
    AbstractVendingMachine stateReportsAndLogging;
    AbstractVendingMachine myMachine;



    public ContextVendingMachine() throws FileNotFoundException {
        state = new StateNoMoney(this);
        state = new StateHasMoney(this);
        state = new StateDispensing(this);
        state = new StateReportsAndLogging(this);

        state = stateNoMoney;
    }

    public AbstractVendingMachine getStateNoMoney() {
        return stateNoMoney;
    }

    public static AbstractVendingMachine getStateHasMoney() {
        return stateHasMoney;
    }

    public AbstractVendingMachine getStateDispensing() {
        return stateDispensing;
    }

    public AbstractVendingMachine getStateReportsAndLogging() {
        return stateReportsAndLogging;
    }


    public AbstractVendingMachine getCurrentState() {
        return state;
    }

    public void setAbstractVendingMachine(AbstractVendingMachine newAbVendingMachineState) {
        this.state = newAbVendingMachineState;
    }

}

//    public double getCurrentMoney() {
//        return currentMoney;
//    }
//
//    public void setCurrentMoney(double currentMoney) {
//        this.currentMoney = currentMoney;
//    }
//
//    public double getReturnMoney() {
//        return returnMoney;
//    }
//
//    public void setReturnMoney(double returnMoney) {
//        this.returnMoney = returnMoney;
//    }
//}

