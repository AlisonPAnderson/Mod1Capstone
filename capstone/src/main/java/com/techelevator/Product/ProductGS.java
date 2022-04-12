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
                String id,name,type;
                Double price;

                while (sc.hasNextLine()) {  // Scanning the String
                    id = sc.next();
                    name = sc.next();
                    price = sc.nextDouble();
                    type = sc.next();

                    if (type.contains("Chip")) {  //  Comparing the user product choice
                        listProduct.add(new Chip(name, price));     // List - Making, and holding a new Chip object
                        menu.put(id, listProduct.get(line));        // Map - <ID, line number> (int to tie the List and
                        line++;                                     // entries together)
                    }
                    if (type.contains("Drink")) {
                        listProduct.add(new Drink(name, price));
                        menu.put(id, listProduct.get(line));
                        line++;
                    }
                    if (type.contains("Gum")){
                        listProduct.add(new Gum(name, price));
                        menu.put(id, listProduct.get(line));
                        line++;
                    }
                    if (type.contains("Candy")){
                        listProduct.add(new Candy(name, price));
                        menu.put(id, listProduct.get(line));
                        line++;
                    }

                }

            }

        }catch (
                FileNotFoundException e1){
            System.out.println("problem");
        }
    }

    public void printInventory() {
       scanFile();
       String test = String.valueOf(listProduct.get(0));
        System.out.println(test + "list .get (0)");
        menu.forEach((key, value) -> {System.out.println( "press " + key + " - for: " + value.getName() + " - $" + value.getPrice() + " --  Stock remaining: " +
                value.getQuantity()  );});
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



//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.*;
//import java.util.regex.Pattern;
//
//public class ProductGS {
//    Map<String,Product> menu=new TreeMap<>();
//    List<Product> productsList=new ArrayList<>();
//    //Map<String,Product> inventory= myT.getmenu("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");
//
////    private Map<String,Product> menu=new TreeMap<>();   //// we use TreeMap alphabetical order (A1,A2...Z).
////    private List<Product> productsList = new ArrayList<>();
////    private Map<String, Product> inv = new HashMap<>();
//
////    private int line = 0;
//
//    // Khaled filepath
//    // File file2 = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");
//
//    // Alison filepath
//   // File file2 = new File("C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
//   //         "-capstone\\capstone\\vendingmachine.csv");
//
//
//
//    public Map<String,Product> buildMenu(String path) throws FileNotFoundException {
//        int line=0;
//
//        String path1 = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1-capstone" +
//                "\\capstone\\vendingmachine.csv";
//        File inputFile = new File(path1);
//        try(Scanner input=new Scanner(inputFile)){
//            while (input.hasNextLine()){
//                String lineFromFile= input.nextLine();
//                String[] lineAsArray = lineFromFile.split(Pattern.quote("|"));
//
//
//                if (lineAsArray[3].equals("Chip")){
//                    productsList.add(line,new Chip(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
//                    menu.put(lineAsArray[0],productsList.get(line));
//                    line++;
//                }
//
//                if (lineAsArray[3].equals("Drink")){
//                    productsList.add(line,new Drink(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
//                    menu.put(lineAsArray[0],productsList.get(line));
//                   line++;
//                }
//                if (lineAsArray[3].equals("Candy")){
//                    productsList.add(line,new Candy(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
//                    menu.put(lineAsArray[0],productsList.get(line));
//                  //  line++;
//                }
//                if (lineAsArray[3].equals("Gum")){
//                    productsList.add(line,new Gum(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
//                    menu.put(lineAsArray[0],productsList.get(line));
//                  //  line++;
//                }
//                line++;
//            }
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//
//        return menu;
//    }
//
//
////
////    public Map<String, Product> buildMenu() throws FileNotFoundException {
////        String path = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1-capstone" +
////                "\\capstone\\vendingmachine.csv";
////
////            int line=0;
////            File inputFile = new File(path);
////
////            try(Scanner input=new Scanner(inputFile)){
////                while (input.hasNextLine()){
////                    String lineFromFile= input.nextLine();
////                    String[] lineAsArray = lineFromFile.split(Pattern.quote("|"));  /// [0] ID, [1] name, [2] price, [3] type
////                    System.out.println(lineAsArray[3] + "im here");
////                    if (lineAsArray[3].equals("Chip")){
////                        //behind the sean:
////                        // productList(0 , new Chip("Potato Crisps",3.05)
////                        // menu.put ("A1", productList.get(0))
////                        // productsList.get(0) points to the obj of type Chip in this case.
////
////                        productsList.add(line,new Chip(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
////                        menu.put(lineAsArray[0],productsList.get(line));
////                        line++;
////                    }
////                    if (lineAsArray[3].equals("Drink")){
////                        productsList.add(line,new Drink(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
////                        menu.put(lineAsArray[0],productsList.get(line));
////                        line++;
////                    }
////                    if (lineAsArray[3].equals("Candy")){
////                        productsList.add(line,new Candy(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
////                        menu.put(lineAsArray[0],productsList.get(line));
////                        line++;
////                    }
////                    if (lineAsArray[3].equals("Gum")){
////                        productsList.add(line,new Gum(lineAsArray[1],Double.parseDouble(lineAsArray[2])));
////                        menu.put(lineAsArray[0],productsList.get(line));
////                        line++;
////                    }
////
////
//////                    switch (lineAsArray[3]) {  // Creating the objects (products) + store them in the map
//////                        case "Chip":
//////                            productsList.add(line, new Chip(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
//////                            menu.put(lineAsArray[0], productsList.get(line));  // productList(0 , new Chip("Potato Crisps",3.05)
//////                            line++;                                             // menu.put ("A1", productList.get(0))
//////                            break;                                              // productsList.get(0) is obj of type Chip
//////                        case "Drink":
//////                            productsList.add(line, new Drink(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
//////                            menu.put(lineAsArray[0], productsList.get(line));
//////                            line++;
//////                            break;
//////                        case "Candy":
//////                            productsList.add(line, new Candy(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
//////                            menu.put(lineAsArray[0], productsList.get(line));
//////                            line++;
//////                            break;
//////                        case "Gum":
//////                            productsList.add(line, new Gum(lineAsArray[1], Double.parseDouble(lineAsArray[2])));
//////                            menu.put(lineAsArray[0], productsList.get(line));
//////                            line++;
//////                            break;
//////                    }
////                }
////            }catch (FileNotFoundException e){
////                System.out.println(e.getMessage());
////            }
////
////        return menu;
////    }
//
//    public Map<String, Product> getMenu() {
//        return menu;
//    }
//
//    public void setMenu(HashMap<String, Product> menu) {
//        this.menu =  menu;
//    }
//
//    public List<Product> getProductsList() {
//        return productsList;
//    }
//
//    public void printInventory(Map<String, Product> menu) {
//
//        System.out.println("ProductGS class - print Inv method menu size" + menu.size());
//        System.out.println("ProductGS class - print Inv method product list size " + productsList.size());
//
//        menu.forEach((key, value) -> {System.out.println("ID: " + key + " name: " + value.getName() + " quantity: " +
//                value.getQuantity() + " type: "+ value.getClass().getSimpleName() );});
//    }
//
//    public void setProductsList(List<Product> productsList) {
//        this.productsList = productsList;
//    }
//
//}
