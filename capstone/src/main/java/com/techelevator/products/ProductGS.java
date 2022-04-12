package com.techelevator.products;
//import com.techelevator.DispensingState;
import com.techelevator.NoMoneyState;
import com.techelevator.VendingMachine;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.regex.Pattern;

public class ProductGS {

    private Map<String,Product> menu;
    private List<Product> productsList;
    double amountRemaining = 0.00;


    public Map<String,Product> buildMenu() throws FileNotFoundException {
        int line=0;

       this.menu =new TreeMap<>();
       this.productsList=new ArrayList<>();
      // File inputFile = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");
        File inputFile = new File("C:\\Users\\Alison\\Downloads\\capstone-light\\capstone\\vendingmachine.csv");

       try(Scanner input=new Scanner(inputFile)){
           while (input.hasNextLine()){
               String lineFromFile= input.nextLine();
               /// take each line from the input file,then split it
               String[] lineAsArray = lineFromFile.split(Pattern.quote("|"));

               if (lineAsArray[3].equals("Chip")){


                   productsList.add(line,new Chip(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
                   menu.put(lineAsArray[0],productsList.get(line));
                   line++;
               }
               if (lineAsArray[3].equals("Drink")){
                   productsList.add(line,new Drink(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
                   menu.put(lineAsArray[0],productsList.get(line));
                   line++;
               }
               if (lineAsArray[3].equals("Candy")){
                   productsList.add(line,new Candy(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
                   menu.put(lineAsArray[0],productsList.get(line));
                   line++;
               }
               if (lineAsArray[3].equals("Gum")){
                   productsList.add(line,new Gum(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
                   menu.put(lineAsArray[0],productsList.get(line));
                   line++;
               }

           }

       }catch (FileNotFoundException e){
           System.out.println(e.getMessage());
       }


        return menu;
    }


    public void printMenu (){
        for (Map.Entry<String,Product> item:this.menu.entrySet()){
            System.out.printf("%s %s %s %s $%,.2f  %s %d\n", item.getKey(), " - ", item.getValue().getName(), " - ",  item.getValue().getPrice(), " -  Quantity Remaining:", item.getValue().getQuantity() );
        }
    }
    public void dispense(String selectProductIDButtonPushed) throws FileNotFoundException {
        // Name, Cost, Money Remaining
       // System.out.printf("%s %s %s %s $%,.2f  %s %d\n", menu.get(selectProductIDButtonPushed), " - ", menu.getValue().getName(), " - ",  item.getValue().getPrice(), " -  Quantity Remaining:", item.getValue().getQuantity() );
      //  System.out.printf("%s %s $%,.2f $%.2f %d", "You chose : ", menu.get(selectProductIDButtonPushed), menu.get(selectProductIDButtonPushed).getPrice(), amountRemaining, menu.get(selectProductIDButtonPushed).getQuantity());
        System.out.println("It sounds like you want some delicious " + buildMenu().get(selectProductIDButtonPushed).getName()+ "!   - Dispensing ...in progress.");
        buildMenu().get(selectProductIDButtonPushed).sound();
    }

}
