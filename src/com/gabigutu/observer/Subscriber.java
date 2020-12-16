package com.gabigutu.observer;

public class Subscriber {

    private Newsletter newsletter;

    public Subscriber(Newsletter newsletter) {
        this.newsletter = newsletter;
    }

    public void subscribe() {
        newsletter.subscribe(this);
    }

    public void sendMail(String message) {
        System.out.println("Received notification: " + message);
    }

}
