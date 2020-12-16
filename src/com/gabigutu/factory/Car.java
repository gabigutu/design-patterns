package com.gabigutu.factory;

public class Car extends Product implements IVideoPlayer, IWithScreen {

    private int noWheels;
    private String model;
    private int modelYear;

    public Car(String model, int modelYear) {
        super(model,"white");
        this.modelYear = modelYear;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "noWheels=" + noWheels +
                ", modelYear=" + modelYear +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }

    @Override
    public void playVideo() {

    }

    @Override
    public void startScreen() {

    }
}
