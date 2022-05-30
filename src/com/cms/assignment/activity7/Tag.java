package com.cms.assignment.activity7;

public class Tag { // Product Tag class
    private final String name; // name field
    private int price; // price field

    public Tag(String name, int price) { // Class constructor
        this.price = price; // initialization of constructor
        this.name = name;
    }

    public String getName() { // method to get product name
        return this.name;
    }

    public int getPrice() {  // Method to get product price
        return this.price = convertPrice();
    }

    private int convertPrice() { // method to convert price
        if (this.name.toLowerCase().startsWith("a")) return 100;
        else if (this.name.toLowerCase().startsWith("e")) return 200;
        else if (this.name.toLowerCase().startsWith("i")) return 300;
        else if (this.name.toLowerCase().startsWith("o")) return 400;
        else if (this.name.toLowerCase().startsWith("u")) return 500;
        else return 1000;
    }

}
