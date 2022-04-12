package com.techelevator.products;

public abstract  class Product {
    private String name;
    private int quantity = 5;
    private Double price;
/*
   static File file1 = new File("C:\\Users\\khaled\\Desktop\\capstone\\module-1-capstone\\capstone\\vendingmachine.csv");

    Map<String,Product> menu = new HashMap<>();
    try(static Scanner fileInput = new Scanner(file1))

    {


    }
        while (fileInput.hasNextLine()) {
            fileInput.useDelimiter("|");
            String itemID = fileInput.nextLine();
            String name = fileInput.nextLine();
            Double price = fileInput.nextDouble();
            String obj = fileInput.nextLine();
            fileInput.useDelimiter("\r\n");

            Product name = new obj();
            menu.put(itemID, );
        }
*/
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;

    }
    public void reduceQuantity(){
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

    public abstract void sound();
}
