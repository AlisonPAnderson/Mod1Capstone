//package com.techelevator;
//
//import com.techelevator.products.ProductGS;
//
//import java.io.FileNotFoundException;
//
//public class DispensingState implements VendingMachineStates{
//    VendingMachine vendingMachine;
//    HasMoneyState hasMoneyState = new HasMoneyState();
//    ProductGS dispensingObj = new ProductGS();
//    private String purchaseMenuButtonPushed = "";
//    private String mainMenuButtonPushed = "";
//    private String selectProductIDButtonPushed = hasMoneyState.getSelectProductIDButtonPushed();
//    private int currentMoneyProvided = 0;
//    public DispensingState(VendingMachine myMachine) {
//    }
//
//    @Override
//    public void displayMainMenu() {
//
//    }
//
//    @Override
//    public void displayPurchaseMenu() {
//
//    }
//
//    @Override
//    public void selectProduct() {
//
//    }
//
//    @Override
//    public void dispenseProduct(String selectProductIDButtonPushed) throws FileNotFoundException {
////        if (vendingMachine.productsMap.containsKey(selectProductIDButtonPushed)) {
////
////            // check the quantity
////            if (vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() > 0) {
//                System.out.println("dispensing state getting the item successfully" + selectProductIDButtonPushed);
//
//                dispensingObj.dispense(selectProductIDButtonPushed);
//              vendingMachine.setVendingMachineState(vendingMachine.getYesHasMoneyState());
//              vendingMachine.vendingMachineState.displayPurchaseMenu();
////                vendingMachine.productsMap.get(selectProductIDButtonPushed).dispensing();
////            } else if (vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() <=0){
////                System.out.println("item is out of stock");
////                this.displayPurchaseMenu();
////            }
////        }
//
//    }
//
//    @Override
//    public void finishTransaction() {
//
//    }
//
//    @Override
//    public void returnMoney() {
//
//    }
//
//    public String getPurchaseMenuButtonPushed() {
//        return purchaseMenuButtonPushed;
//    }
//
//    public void setPurchaseMenuButtonPushed(String purchaseMenuButtonPushed) {
//        this.purchaseMenuButtonPushed = purchaseMenuButtonPushed;
//    }
//
//    public String getMainMenuButtonPushed() {
//        return mainMenuButtonPushed;
//    }
//
//    public void setMainMenuButtonPushed(String mainMenuButtonPushed) {
//        this.mainMenuButtonPushed = mainMenuButtonPushed;
//    }
//
//    public String getSelectProductIDButtonPushed() {
//        return selectProductIDButtonPushed;
//    }
//
//    public void setSelectProductIDButtonPushed(String selectProductIDButtonPushed) {
//        this.selectProductIDButtonPushed = selectProductIDButtonPushed;
//    }
//}
