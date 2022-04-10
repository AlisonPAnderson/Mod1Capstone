package com.techelevator.Product;

public class Gum extends Product {

    public Gum(String name, Double price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("Chew, Chew, Yum!");

    }
}
