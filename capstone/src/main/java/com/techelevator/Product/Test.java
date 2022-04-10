package com.techelevator.Product;
import com.techelevator.Product.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Test {

    public static void main(String[] args) {

        double inMachine = 3.00;    // test money
        double returnOut = 1.05;
        double q = 0.25;

        // Khaled filepath
        // File file2 = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");

        // Alison filepath
        File file2 = new File("C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
                "-capstone\\capstone\\vendingmachine.csv");

        Map<String,Product> menu = new HashMap<>();
        List<Product> listProduct = new ArrayList<>();
        int line = 0;

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
                        menu.put(id, listProduct.get(line));        // Map - <ID, line number> (int to tie the List and Map
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

        }catch (FileNotFoundException e1){
            System.out.println("problem");
        }

        // TODO Tie this into "Dispensing State"
        for (Map.Entry<String,Product> item:menu.entrySet()){   // Prints the menu for the user
            System.out.println("id: " + item.getKey() + " name: " + item.getValue().getName() +" quantity: " +item.getValue().getQuantity() + " type: "+item.getValue().getClass().getSimpleName() );
        }

        Scanner in = new Scanner(System.in); // Scanner to accept user input (menu choice)
        String input = in.nextLine();

        if(input.equalsIgnoreCase("A1")){
            // TODO Add money - user balance update
            menu.get(input).dispensing();               // calls object dispensing & sound methods - using map.
            menu.get(input).sound();
        }

        for (Map.Entry<String, Product> item:menu.entrySet()){
            System.out.println("id: " + item.getKey() + " name: " + item.getValue().getName() +" quantity: " +item.getValue().getQuantity() + " type: "+item.getValue().getClass().getSimpleName() );
        }


        // TODO - I don't think we need the following code  -- double check before deleting
        Map<String, Product> inv = new HashMap<>();
/*

        for (Map.Entry<String, Product> item : inv.entrySet()) {
            System.out.println("item code: " + item.getKey() + "  name:" + item.getValue().getName() + " quantity: " + item.getValue().getQuantity() + " price: " + item.getValue().getPrice());
        }

        System.out.println("please choose :(enter an item code)");
        String user = in.nextLine();

        if (inv.containsKey(user)){
            inv.get(user).dispensing();
            System.out.println("dispensing:" + inv.get(user).getName()+ " ...in progress");
        }
        else System.out.println("invalid code");

        System.out.println("new list");

        for (Map.Entry<String, Product> item : inv.entrySet()) {
            System.out.println("item code: " + item.getKey() + "  name:" + item.getValue().getName() + " quantity: " + item.getValue().getQuantity() + " price: " + item.getValue().getPrice());
        }
*/


    }
}
