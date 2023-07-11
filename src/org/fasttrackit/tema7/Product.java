package org.fasttrackit.tema7;

public class Product {

    private String name;

    private double price;

    private int quantity;

    private String category;


    Product(String name, double price, int quantity, String category) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;

    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getCategory() {
        return this.category;
    }

    public boolean hasStock() {

        if (this.quantity > 0) {
            return true;
        }
        else {

            return false;
        }
    }

    public boolean isCategory(String category) {

        if (this.category.equals(category)) {
            return true;
        }
        else  {
            return false;
        }
    }

}
