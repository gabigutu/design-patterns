package com.gabigutu.factory;

public class Product implements Something {

    protected String name;
    protected String colour;
    protected float price;

    public Product(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public Product() { }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public void exists() {

    }
}
