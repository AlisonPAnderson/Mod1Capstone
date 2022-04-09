package com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Product {

    String itemID = "";
    String itemName = "";
    Double itemPrice = 0.0;
    String itemType = "";
    int itemQuantity = 5;






    public Product(String itemID, String itemName, Double itemPrice, String itemType, int itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemType = itemType;
        this.itemQuantity = itemQuantity;
    }

    public Product() {

    }

    public static void main (String[] args) throws FileNotFoundException {

        String itemID = "";
        String itemName = "";
        Double itemPrice = 0.0;
        String itemType = "";
        int itemQuantity = 5;





        String filepath = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PersonalVending\\module-1-capstone\\capstone" +
                "\\vendingmachine.csv";

        File inputFile = new File(filepath);

        try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNextLine()) {
              itemID =  scanner.nextLine();
              itemName = scanner.nextLine();
              itemPrice = scanner.nextDouble();
              itemType = scanner.nextLine();


              // TODO we have to put the data somewhere as it streams in...

                //  TODO so we can compare against type, if we want to use separate product type classes..
                //  TODO or if we use a collection so we can compare against the ITEM id at purchase..

            }

            if (itemType.equals("Chip")) {


            }


        } catch (FileNotFoundException e) {

        }





    }
}
