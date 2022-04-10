package com.techelevator.States;

public interface VendingMachineStates {
    int cash = 0;
    void displayMainMenu ();

    void displayPurchaseMenu();

    void feedMoney (int cash);

    void returnMoney(int cash);

    void selectProduct ();

    void dispenseProduct();

    void displayItems();

    void finishTransaction();

    void salesReport();

    void auditLog();




}
