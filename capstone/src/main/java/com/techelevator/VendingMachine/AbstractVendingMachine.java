package com.techelevator.VendingMachine;

import java.io.FileNotFoundException;

public abstract class VendingMachineAbstract {
    private Product product;

    public VendingMachineAbstract () {

    }
    protected abstract String getStateDescription();

  public VendingMachineAbstract displayMainMenu() throws FileNotFoundException {
      throw new FileNotFoundException();
  }
  public VendingMachineAbstract displayMenuItems() throws FileNotFoundException {
      throw new FileNotFoundException();
  }
  public VendingMachineAbstract displayPurchaseMenu() throws FileNotFoundException {
      throw new FileNotFoundException();
  }

  public VendingMachineAbstract feedMoney() throws IllegalStateException {
      throw new IllegalStateException("You cannot insert Cash " + getStateDescription());
  }

  public VendingMachineAbstract selectProduct() throws IllegalStateException {
      throw new IllegalStateException("You cannot select a product " + getStateDescription());
  }
  public VendingMachineAbstract dispense() throws IllegalStateException {
      throw new IllegalStateException("Cannot dispense " + getStateDescription());
  }
  public VendingMachineAbstract finishTransaction() throws IllegalStateException {
      throw new IllegalStateException("You cannot finish this transaction " + getStateDescription());
  }

}
