package com.gabigutu.factory;

public class ACME { // Factory Design Pattern

    public ACME() {  }

    public Something createProduct(ProductType productType) {
        switch (productType) {
            case CAR:
                return new Car("BMW", 2018);
            case SAUSAGE:
                return new Sausage(MeatType.CHICKEN);
        }
        return null;
    }

}

enum ProductType {
    CAR,
    SAUSAGE
}
