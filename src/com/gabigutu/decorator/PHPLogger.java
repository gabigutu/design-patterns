package com.gabigutu.decorator;

public class PHPLogger extends Logger {

    public void logNotice(String notice) {
        System.out.println("PHP Notice: " + notice);
    }

    public void logError(String message, PHPErrorType phpErrorType) {
        System.out.println("PHP " + phpErrorType + ": " + message);
    }


}

enum PHPErrorType {
    ERROR,
    NOTICE,
    WARNING
}
