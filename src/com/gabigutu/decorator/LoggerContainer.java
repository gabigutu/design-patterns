package com.gabigutu.decorator;

public class LoggerContainer {

    private Logger logger;

    public LoggerContainer(Logger logger) {
        this.logger = logger;
    }

    public void logToDatabase(String message) {
        System.out.println("Send to database: " + message);
    }

    public Logger getLogger() {
        return logger;
    }
}
