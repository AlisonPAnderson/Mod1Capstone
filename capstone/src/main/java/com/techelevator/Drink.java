package com.techelevator;

import com.techelevator.Product;

public class Drink extends Product {

    public Drink(String name,Double price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("Glug, Glug, Yum!");
    }

}
