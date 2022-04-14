package com.techelevator;

import com.techelevator.Product;

public class Candy extends Product {
    public Candy(String name, Double price) {
        super(name, price);
    }

    @Override
    public void sound() {
        System.out.println("Munch, Munch, Yum!");
    }
}
