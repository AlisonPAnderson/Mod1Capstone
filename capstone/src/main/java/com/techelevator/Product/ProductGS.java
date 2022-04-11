package com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class ProductGS {

    private Map<String,Product> menu=new TreeMap<>();   //// we use TreeMap alphabetical order (A1,A2...Z).
    private List<Product> productsList = new ArrayList<>();
    private Map<String, Product> inv = new HashMap<>();
    private int line = 0;

    // Khaled filepath
    // File file2 = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");

    // Alison filepath
    File file2 = new File("C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
            "-capstone\\capstone\\vendingmachine.csv");




    public void printInventory() {
            menu.forEach((key, value) -> {System.out.println("ID: " + key + " name: " + value.getName() + " quantity: " +
                    value.getQuantity() + " type: "+ value.getClass().getSimpleName() );});
    }

    public Map<String, Product> buildMenu(String path) throws FileNotFoundException {

            int line=0;
            File inputFile = new File(path);

            try(Scanner input=new Scanner(inputFile)){
                while (input.hasNextLine()){
                    String lineFromFile= input.nextLine();
                    String[] lineAsArray = lineFromFile.split(Pattern.quote("|"));  /// [0] ID, [1] name, [2] price, [3] type

                    switch (lineAsArray[3]) {  // Creating the objects (products) + store them in the map
                        case "Chip":
                            productsList.add(line, new Chip(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
                            menu.put(lineAsArray[0], productsList.get(line));  // productList(0 , new Chip("Potato Crisps",3.05)
                            line++;                                             // menu.put ("A1", productList.get(0))
                            break;                                              // productsList.get(0) is obj of type Chip
                        case "Drink":
                            productsList.add(line, new Drink(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
                            menu.put(lineAsArray[0], productsList.get(line));
                            line++;
                            break;
                        case "Candy":
                            productsList.add(line, new Candy(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
                            menu.put(lineAsArray[0], productsList.get(line));
                            line++;
                            break;
                        case "Gum":
                            productsList.add(line, new Gum(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
                            menu.put(lineAsArray[0], productsList.get(line));
                            line++;
                            break;
                    }
                }
            }catch (FileNotFoundException e){
                System.out.println(e.getMessage());
            }

        return menu;
    }

    public Map<String, Product> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, Product> menu) {
        this.menu =  menu;
    }

    public List<Product> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<Product> productsList) {
        this.productsList = productsList;
    }

    public Map<String, Product> getInv() {
        return inv;
    }

    public void setInv(Map<String, Product> inv) {
        this.inv = inv;
    }
}
