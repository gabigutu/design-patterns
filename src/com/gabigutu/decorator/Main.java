package com.gabigutu.decorator;

public class Main {

    public static void main(String[] args) {

        LoggerContainer[] loggerContainers = new LoggerContainer[2];
        loggerContainers[0] = new LoggerContainer(new JavaLogger());
        loggerContainers[1] = new LoggerContainer(new PHPLogger());

        for (LoggerContainer loggerContainer : loggerContainers) {
            loggerContainer.logToDatabase("Product inserted");
            Logger logger = loggerContainer.getLogger();
            if (logger instanceof PHPLogger) {
                ((PHPLogger)logger).logNotice("Notice");
            } else if (logger instanceof JavaLogger) {
                ((JavaLogger)logger).logException("Exception");
            }
        }

    }
}
