package com.learninghub.pattern.observer;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
