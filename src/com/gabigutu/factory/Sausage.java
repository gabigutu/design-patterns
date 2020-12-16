package com.gabigutu.factory;

public class Sausage extends Product {

    private MeatType meatType;

    public Sausage(MeatType meatType) {
        super(meatType + " sausage ", null);
        this.meatType = meatType;
    }

    public void expire(int noDays) {
        System.out.println("Expired by " + noDays + " days");
    }

    @Override
    public String toString() {
        return "Sausage{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", meatType=" + meatType +
                '}';
    }
}

enum MeatType {
    PORK,
    COW,
    CHICKEN
}
