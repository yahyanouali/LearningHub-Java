package com.learninghub.pattern.observer;

public class Client {

    public static void main(String[] args) {

        MyTopic coolTopic = new MyTopic();
        Observer subscriber1 = new MyTopicSubscriber("subscriber1");
        Observer subscriber2 = new MyTopicSubscriber("subscriber2");
        Observer subscriber3 = new MyTopicSubscriber("subscriber3");

        subscriber1.setSubject(coolTopic);
        subscriber2.setSubject(coolTopic);
        subscriber3.setSubject(coolTopic);

        coolTopic.register(subscriber1);
        coolTopic.register(subscriber2);
        coolTopic.register(subscriber3);

        coolTopic.postMessage("Hi");
        coolTopic.unregister(subscriber2);
        coolTopic.postMessage("Hi Hi");

    }
}
