package com.techelevator.States;

import java.io.FileNotFoundException;

public interface VendingMachineStates {
    int cash = 0;
    void displayMainMenu () throws FileNotFoundException;

    void displayPurchaseMenu();

    void feedMoney ();

    void returnMoney();

    void selectProduct ();

    void dispenseProduct();

    void displayItems();

    void finishTransaction();

    void salesReport();

    void auditLog();




}
