package com.learninghub.pattern.observer;

public class MyObserver implements Observer {

    private Subject subject;
    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) subject.getMessage();
        System.out.println("Observer " + this.name + " received new message from the topic = " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;

    }
}
