package com.gabigutu.factory;

public class Main {

    public static void main(String[] args) {
        ACME acme = new ACME();
        // com.gabigutu.factory.Product@a6de2d
        Something[] products = new Product[2];
        products[0] = acme.createProduct(ProductType.CAR);
        products[1] = acme.createProduct(ProductType.SAUSAGE);

        for(Something product : products) {
            System.out.println(product);
            if (product instanceof Car) {
                ((Car) product).startEngine();
            } else if (product instanceof Sausage) {
                ((Sausage) product).expire(2);
            }
        }
    }


}
