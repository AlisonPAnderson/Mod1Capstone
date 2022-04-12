package com.techelevator;

import java.io.FileNotFoundException;

public interface VendingMachineStates {
    void displayMainMenu() throws FileNotFoundException;
    void displayPurchaseMenu() throws FileNotFoundException;
    void selectProduct () throws FileNotFoundException;
    void dispenseProduct(String selectProductIDPushed) throws FileNotFoundException;


    ///
    void finishTransaction();
    void returnMoney();






}
