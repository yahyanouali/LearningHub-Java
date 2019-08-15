package com.learninghub.pattern.observer;

public interface Subject {
    Object getMessage();
    void register(Observer observer) throws Exception;
    void unregister(Observer observer);
    void notifyAllObservers();
}
