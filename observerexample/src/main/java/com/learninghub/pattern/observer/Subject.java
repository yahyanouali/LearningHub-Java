package com.learninghub.pattern.observer;

public interface Subject {

    //used by the client to add and remove observers
    void register(Observer observer) throws Exception;
    void unregister(Observer observer);

    //used by the subject to notify observers for updates (changes)
    void notifyObservers();

    //used by the observers to get the update
    Object getUpdate();
}
