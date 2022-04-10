//package com.techelevator;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.*;
//
//public class Inventory {
//
//    public static void main (String[] args) {
//        String itemID;
//        String snackBrand;
//        Double price;
//        String snackType;
//        int startingQty = 5;
//
//
//
//        Map<String, Integer> inventoryMap = new HashMap<>(); //Holds the STOCK amounts of the inventory items
//        Integer startingInventoryAmount = 5;
//        String temporary; // holds the inventory items CSV as a String
//
//        String filepath = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
//                "-capstone\\capstone\\vendingmachine.csv";
//        File inventoryFile = new File(filepath);
//        Map<String, Integer> testMap = new HashMap<>();
//        String itemIDTest;
//        String itemType;
//        LinkedList<String> testLinkedList = new LinkedList<String>();
//
//
//     //  public void testInvantory () {
//            try (Scanner fileInput = new Scanner(inventoryFile)) {
//
//                while (fileInput.hasNextLine()) {
//                    fileInput.useDelimiter(";");
//                    //fileInput.useDelimiter("|");
//                    itemIDTest = fileInput.nextLine();
//                    testMap.put(fileInput.nextLine(), startingQty);
//                    itemType = fileInput.nextLine();
//
//
//                }
//            } catch (FileNotFoundException e) {
//
//            }
//            System.out.println(testMap.entrySet());
//
//            testMap.entrySet()
//                    .stream()
//                    .sorted(Map.Entry.<String, Double>comparingByKey())
//                    .forEach(System.out::println);
//
//        //}
//        //public void printInvantory () {
////
////            try (Scanner fileInput = new Scanner(inventoryFile)) {
////
////                while (fileInput.hasNextLine()) {
////
////                    fileInput.useDelimiter(";");
////
////                    // assigning the inventory stock items to the string
////                    temporary = fileInput.nextLine();
////
////                    inventoryMap.put(temporary, startingInventoryAmount); // putting the lists as the Key in a map, with the amount of inventory as the Value.
////
////                }
////            } catch (FileNotFoundException e) {
////            }
////
//
//            // This prints the inventory items and the starting stock of 5 ea.
//
//            inventoryMap.entrySet()
//                    .stream()
//                    .sorted(Map.Entry.<String, Integer>comparingByKey())
//                    .forEach(System.out::println);
//            //String itemIDSelection = "A1";
//
//        }
//    }
//
//
//
//
//
//
//
//
