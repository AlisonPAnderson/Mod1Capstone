package com.techelevator.VendingMachine;

import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class AbstractVendingMachine {
    private Product product;
    Scanner input = new Scanner(System.in);


    public AbstractVendingMachine() {

    }





  public void displayMainMenu() throws FileNotFoundException {
        throw new FileNotFoundException();
    }
  public void displayMenuItems() throws FileNotFoundException {
        throw new FileNotFoundException();
  }
  public displayPurchaseMenu() throws FileNotFoundException {
        throw new FileNotFoundException()
  }

  public abstract void feedMoney();

  public AbstractVendingMachine selectProduct() throws IllegalStateException {
      throw new IllegalStateException("You cannot select a product " + getStateDescription());
  }
  public AbstractVendingMachine dispense() throws IllegalStateException {
      throw new IllegalStateException("Cannot dispense " + getStateDescription());
  }
  public AbstractVendingMachine finishTransaction() throws IllegalStateException {
      throw new IllegalStateException("You cannot finish this transaction " + getStateDescription());
  }

}
