package com.gabigutu.observer;

import javax.security.auth.Subject;

public class Main {

    public static Newsletter newsletter;

    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Subscriber[] subscribers = new Subscriber[5];
        for (int i = 0; i < 5; i++) {
            subscribers[i] = new Subscriber(newsletter);
            subscribers[i].subscribe();
        }

        newsletter.broadcast("Salutare!");
    }



    public static void sendMessage(String message) {
        newsletter.broadcast(message);
    }

}
