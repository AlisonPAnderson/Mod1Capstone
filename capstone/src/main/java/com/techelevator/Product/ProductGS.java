package com.techelevator.Product;
//import com.techelevator.DispensingState;

import com.techelevator.Product.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class ProductGS {
    String[] lineAsArray;
    private String fileName = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
            "-capstone\\capstone\\vendingmachine.csv";
    //private Map<String,Product> snackChoices;
    Map<String, Product> snackChoices = new TreeMap<>();
    int line=0;
    private List<Product> productsList = new ArrayList<>();
    private double itemPrice = 00.00;
    String productName = "";
    String productType = "";
    String productID = "";



    public Map<String,Product> buildMenu()  {
        // this.snackChoices =new TreeMap<>();
        //this.productsList=new ArrayList<>();
        File inputFile = new File(fileName);

        try(Scanner input=new Scanner(inputFile)){
            while (input.hasNextLine()){  /// take each line from the input file,then split it

                String lineFromFile= input.nextLine();
                lineAsArray = lineFromFile.split(Pattern.quote("|"));

                String productID = lineAsArray[0];    // variables to store the data - avoid confusion
                String productName = lineAsArray[1];
                double productPrice = Double.parseDouble(lineAsArray[2]);

                if (lineAsArray[3].equalsIgnoreCase("Chip")){
                    productsList.add(line,new Chip(productName,productPrice));
                    Product productObject = productsList.get(line);
                    snackChoices.put(productID,productObject);
                    line++;
                }
                if (lineAsArray[3].equalsIgnoreCase("Drink")){
                    productsList.add(line,new Drink(productName,productPrice));
                    Product productObject = productsList.get(line);
                    snackChoices.put(productID,productObject);
                    line++;
                }
                if (lineAsArray[3].equalsIgnoreCase("Candy")){
                    productsList.add(line,new Candy(productName,productPrice));
                    Product productObject = productsList.get(line);
                    snackChoices.put(productID,productObject);
                    line++;
                }
                if (lineAsArray[3].equalsIgnoreCase("Gum")){
                    productsList.add(line,new Gum(productName,productPrice));
                    Product productObject = productsList.get(line);
                    snackChoices.put(productID,productObject);
                    line++;
                }
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        return snackChoices;
    }

    public void printSnackChoices()  {
        double amountRemaining = 0.00;
        int quantityRemaining = 0;
        String productID = "";
        String productName = "";
        double productPrice = 00.00;

        /// buildMenu();

            for (Map.Entry<String, Product> item : this.snackChoices.entrySet()) {

                quantityRemaining = item.getValue().getQuantity();
                productID = item.getKey();
                productName = item.getValue().getName();
                productPrice = item.getValue().getPrice();

                System.out.printf("%s %s %s %s $%,.2f  %s %d\n", productID, " - ", productName, " - ", productPrice, " -  Quantity Remaining:", quantityRemaining);
            }

    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }
// TODO G/S lineAsArray

    //
//    public void dispense(String selectProductIDButtonPushed) throws FileNotFoundException {
//        buildMenu();
//        quantityRemaining = buildMenu().getValue().getQuantity();
//        productID = item.getKey();
//        productName = buildMenu().get(selectProductIDButtonPushed).getName();
//        productPrice = item.getValue().getPrice();
//        // Name, Cost, Money Remaining
//       // System.out.printf("%s %s %s %s $%,.2f  %s %d\n", menu.get(selectProductIDButtonPushed), " - ", menu.getValue().getName(), " - ",  item.getValue().getPrice(), " -  Quantity Remaining:", item.getValue().getQuantity() );
//      //  System.out.printf("%s %s $%,.2f $%.2f %d", "You chose : ", menu.get(selectProductIDButtonPushed), menu.get(selectProductIDButtonPushed).getPrice(), amountRemaining, menu.get(selectProductIDButtonPushed).getQuantity());
//        System.out.println("It sounds like you want some delicious " + productName + "!   - Dispensing ...in progress.");
//        buildMenu().get(selectProductIDButtonPushed).sound();
//    }
//
//
//
//
//    public void dispenseProduct(String selectProductIDButtonPushed) throws FileNotFoundException {
//        System.out.println("getting the item" + selectProductIDButtonPushed+ " successfully");
//
//        vendingMachine.productsMap.get(selectProductIDButtonPushed).reduceQuantity();
//
//        vendingMachine.setCurrentMoney(vendingMachine.getCurrentMoney() - vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice());
//
//        System.out.printf("%s %s $%,.2f\n", "You chose: ",vendingMachine.productsMap.get(selectProductIDButtonPushed).getName(), vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice()   );
//
//        System.out.printf("%s $%,.2f\n", "Your updated balance is: ", vendingMachine.getCurrentMoney());
//
//        System.out.printf("%s %d\n", "Quantity Remaining: ",vendingMachine.productsMap.get(selectProductIDButtonPushed).getQuantity() );
//
//
//        // System.out.println("the new current money" +( vendingMachine.getCurrentMoney() - vendingMachine.productsMap.get(selectProductIDButtonPushed).getPrice()));
//
//        System.out.println();
//        hasMoneyObject.dispense(selectProductIDButtonPushed);
//
//        System.out.println("Would you like anything else?");
//
//
//        this.displayPurchaseMenu();
//


}
