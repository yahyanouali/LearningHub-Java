package com.learninghub.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    String message;
    List<Observer> observers;

    public MyTopic() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) {
        if (observer == null)
            throw new NullPointerException("observer must be not null");
        if (!observers.contains(observer))
            observers.add(observer);
    }

    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update());
    }

    public void postMessage(String message) {
        System.out.println("Message Posted to Topic : " + message);
        this.message = message;
        notifyObservers();
    }

    public String getUpdate() {
        return message;
    }
}
