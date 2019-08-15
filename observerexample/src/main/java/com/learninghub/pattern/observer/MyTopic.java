package com.learninghub.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

    String message;
    List<Observer> observers;

    public MyTopic() {
        observers = new ArrayList<Observer>();
    }

    public void register(Observer observer) throws Exception {

        if (observer == null)
            throw new Exception("observer must be not Null");
        if (!observers.contains(observer))
            observers.add(observer);
    }

    public void unregister(Observer observer) {
        if (observers.contains(observer))
            observers.remove(observer);
    }

    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update());
    }

    public void sendMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public String getMessage() {
        return message;
    }
}
