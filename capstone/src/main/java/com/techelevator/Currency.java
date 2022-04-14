package com.techelevator;

public class Currency {

        private static final double NICKEL=(0.05);
        private static final double DIME=(0.10);
        private static final double QUARTER=(0.25);
        private int numberOfQuarters,numberOfDimes,numberOfNickels;


        public void getChangeInCoins(double balanceFromMachine){
            numberOfQuarters = (int)( balanceFromMachine / QUARTER);
            balanceFromMachine %= QUARTER;
            numberOfDimes = (int) (balanceFromMachine / DIME);
            balanceFromMachine %= DIME;
            numberOfNickels = (int) (balanceFromMachine / NICKEL);
            balanceFromMachine %= NICKEL;

            System.out.println("Your Change: "+ numberOfQuarters + " Quarter(s), "+ numberOfDimes + " Dime(s), "+numberOfNickels+" Nickel(s).");
        }



    }


