package com.kutsyk.behavioral.observer;

public class TabletClient extends Observer {

    public TabletClient(MessageStream subject) {
        setSubject(subject);
        getSubject().attach(this);
    }

    public void addMessage(String message) {
        getSubject().setState(message + " - sent from tablet");
    }

    @Override
    public void update() {
        System.out.println("Table Stream: " + getSubject().getState());
    }
}
