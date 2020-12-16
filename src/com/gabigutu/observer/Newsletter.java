package com.gabigutu.observer;

import java.util.ArrayList;
import java.util.List;

public class Newsletter {

    private List<Subscriber> subscribers;

    public Newsletter() {
        subscribers = new ArrayList<>();
    }

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void broadcast(String message) {
        for (Subscriber subscriber : subscribers) {
            subscriber.sendMail(message);
        }
    }

}
