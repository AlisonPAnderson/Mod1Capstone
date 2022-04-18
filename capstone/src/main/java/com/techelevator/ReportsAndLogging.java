package com.techelevator;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;


public class ReportsAndLogging {


    public static void log(String message) {
        String logFile = "C:\\Users\\Alison\\Desktop\\MeritAmerica\\repos\\PairProgramming\\Capstone\\module-1" +
                "-capstone\\capstone\\src\\main\\java\\com\\techelevator\\log\\log.txt";
        File searchLogFile = new File(logFile);
        try (PrintWriter exceptionLog = new PrintWriter(new FileOutputStream(searchLogFile, true))){
            exceptionLog.println(getTimeForLog()+" "+ message);
            //exceptionLog.printf("%10s, %5s, %5s, %5s, %5s, %5.2f, %5s, %5s, %5.2f", getTimeForLog(), message);
        } catch (FileNotFoundException e) {
            System.out.println(e + "An error has occurred (ReportsAndLogging class)");
        }
    }


    public static String getTimeForLog(){
        LocalDateTime date =  LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss a");
        return date.format(formatter);
    }
    public static String getTimeForReports(){
        LocalDateTime date =  LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd--HH-mm-ss");
        return date.format(formatter);
    }


    public  static void getSalesReports(double totalSales){
        String folderSales= "capstone/src/main/java/com/techelevator/SalesReports/";
        File salesRapportFile = new File(folderSales+"Sales--"+getTimeForReports()+".txt");


        try (PrintWriter dataOutput = new PrintWriter("text.txt", "UTF-8")) {

            //while loop end
            dataOutput.println("$"+totalSales);
        } catch (FileNotFoundException e) {
            System.err.println("Cannot open the file for writing.");
        }catch (UnsupportedEncodingException e2){
            System.out.println(e2.getMessage());
        }

    }


}



