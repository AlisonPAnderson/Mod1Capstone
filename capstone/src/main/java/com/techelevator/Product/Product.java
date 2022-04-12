package com.techelevator.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public abstract class Product {
    private String name;
    private int quantity = 5;
    private Double price;
    private String type;


    public Product(String name, Double price) {
        this.name = name;
        this.price = price;

    }

    public Product() {
    }

    public void dispensing(){
        this.quantity--;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setType(String type) { this.type = type; }

    public String getType() { return type; }

    public abstract void sound();
}
