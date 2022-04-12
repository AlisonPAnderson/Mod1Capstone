//package com.techelevator.Product;
//
//import java.util.*;
//
//public class ProductBuilder extends Product{
//    public ProductBuilder(String name, Double price) {
//        super(name, price);
//    }
//
//    public ProductBuilder() {
//        super();
//    }
//    @Override
//    public void sound() {
//
//    }
//
//
//   public static void main(String[] args) {
//        ProductBuilder productBuilder = new ProductBuilder();
//        ProductGS productGS = new ProductGS();
//        Map<String, Product> menu =  productGS.getMenu();
//        List<Product> listProduct = productGS.getProductsList();
//
//
//       menu.forEach((key, value) -> {System.out.println("ID: " + key + " name: " + value.getName() + " quantity: " +
//               value.getQuantity() + " type: "+ value.getClass().getSimpleName() );});
//
//
//
//
//
//        // TODO Tie this into "Dispensing State"
////        for (menu.Entry<String,Product> item : menu.entrySet()){   // Prints the menu for the user
////            System.out.println("id: " + item.getKey() + " name: " + item.getValue().getName() +" quantity: " +item.getValue().getQuantity() + " type: "+item.getValue().getClass().getSimpleName() );
////        }
//
//        Scanner in = new Scanner(System.in); // Scanner to accept user input (menu choice)
//        String input = in.nextLine();
//
//        if(input.equalsIgnoreCase("A1")){
//            // TODO Add money - user balance update
//            menu.get(input).dispensing();               // calls object dispensing & sound methods - using map.
//            menu.get(input).sound();
//        }
//
//        for (Map.Entry<String, Product> item:menu.entrySet()){
//            System.out.println("id: " + item.getKey() + " name: " + item.getValue().getName() +" quantity: " +item.getValue().getQuantity() + " type: "+item.getValue().getClass().getSimpleName() );
//        }
//
//
//        // TODO - I don't think we need the following code  -- double check before deleting
//        Map<String, Product> inv = new HashMap<>();
///*
//
//        for (Map.Entry<String, Product> item : inv.entrySet()) {
//            System.out.println("item code: " + item.getKey() + "  name:" + item.getValue().getName() + " quantity: " + item.getValue().getQuantity() + " price: " + item.getValue().getPrice());
//        }
//
//        System.out.println("please choose :(enter an item code)");
//        String user = in.nextLine();
//
//        if (inv.containsKey(user)){
//            inv.get(user).dispensing();
//            System.out.println("dispensing:" + inv.get(user).getName()+ " ...in progress");
//        }
//        else System.out.println("invalid code");
//
//        System.out.println("new list");
//
//        for (Map.Entry<String, Product> item : inv.entrySet()) {
//            System.out.println("item code: " + item.getKey() + "  name:" + item.getValue().getName() + " quantity: " + item.getValue().getQuantity() + " price: " + item.getValue().getPrice());
//        }
//*/
//
//
//
//
//
//}
//}
//
