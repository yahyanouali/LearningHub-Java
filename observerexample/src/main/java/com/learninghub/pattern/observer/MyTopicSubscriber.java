package com.learninghub.pattern.observer;

public class MyTopicSubscriber implements Observer {

    private Subject subject;
    private String name;

    public MyTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String message = (String) subject.getUpdate();
        System.out.println(this.name + " received new message : " + message);
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;

    }
}
