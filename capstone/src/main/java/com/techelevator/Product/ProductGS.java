package com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ProductGS {

    private HashMap<String, Product> menu = new HashMap<>();
    private List<Product> listProduct = new ArrayList<>();
    private Map<String, Product> inv = new HashMap<>();
    private int line = 0;

    // Khaled filepath
    // File file2 = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");

    // Alison filepath
    File file2 = new File("C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
            "-capstone\\capstone\\vendingmachine.csv");

private void scanFile () {

        try(Scanner fileInput = new Scanner(file2)){   // Scanning the file

        while (fileInput.hasNextLine()){
            String lineContent = fileInput.nextLine();  // File line by line to this String

            Scanner sc = new Scanner(lineContent);  // second Scanner for the String
            sc.useDelimiter("[|]");  // Using a delimiter to break the string up into the ID/Name/Price/Type
            String id,name,priceS,type;

            while (sc.hasNextLine()) {  // Scanning the String
                id = sc.next();
                name = sc.next();
                priceS = sc.next();
                type = sc.next();
                Double price = Double.parseDouble(priceS);

                if (type.equalsIgnoreCase("Chip")) {  //  Comparing the user product choice
                    listProduct.add(new Chip(name, price));     // List - Making, and holding a new Chip object
                    menu.put(id, listProduct.get(line));        // Map - <ID, line number> (int to tie the List and
                    line++;                                     // entries together)
                }
                if (type.equalsIgnoreCase("Drink")){
                    listProduct.add(new Drink(name, price));
                    menu.put(id, listProduct.get(line));
                    line++;
                }
                if (type.equalsIgnoreCase("Gum")){
                    listProduct.add(new Gum(name, price));
                    menu.put(id, listProduct.get(line));
                    line++;
                }
                if (type.equalsIgnoreCase("Candy")){
                    listProduct.add(new Candy(name, price));
                    menu.put(id, listProduct.get(line));
                    line++;
                }

            }//new while s

        } //TODO big while

    }catch (
    FileNotFoundException e1){
        System.out.println("problem");
    }
}

    public void printInventory() {
            menu.forEach((key, value) -> {System.out.println("ID: " + key + " name: " + value.getName() + " quantity: " +
                    value.getQuantity() + " type: "+ value.getClass().getSimpleName() );});
    }

    public HashMap<String, Product> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Product> menu) {
        this.menu =  menu;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public Map<String, Product> getInv() {
        return inv;
    }

    public void setInv(Map<String, Product> inv) {
        this.inv = inv;
    }
}
