package com.learninghub.pattern.observer;

public interface Observer {

    //used by the subject to update the observer
    void update();

    // attach with subject to observe
    void setSubject(Subject subject);
}
