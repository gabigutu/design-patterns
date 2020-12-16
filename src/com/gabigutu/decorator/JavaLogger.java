package com.gabigutu.decorator;

public class JavaLogger extends Logger {

    public void logException(String message) {
        System.out.println("Java Exception: " + message);
    }

}
