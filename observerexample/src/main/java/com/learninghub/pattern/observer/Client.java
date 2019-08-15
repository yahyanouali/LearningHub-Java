package com.learninghub.pattern.observer;

public class Client {

    public static void main(String[] args) throws Exception {

        MyTopic coolTopic = new MyTopic();
        Observer observer1 = new MyObserver("observer1");
        Observer observer2 = new MyObserver("observer2");
        Observer observer3 = new MyObserver("observer3");

        observer1.setSubject(coolTopic);
        observer2.setSubject(coolTopic);
        observer3.setSubject(coolTopic);

        coolTopic.register(observer1);
        coolTopic.register(observer2);
        coolTopic.register(observer3);

        coolTopic.sendMessage("Hi");
        coolTopic.unregister(observer2);
        Thread.sleep(1800);
        coolTopic.sendMessage("Hi Hi");


    }
}
