package org.sample.amqp.async.json;

public class HelloWorldHandler {
    public void handleMessage(SimplePojo simplePojo) {
        System.out.println("Received: Key = " + simplePojo.getKey() + ", message = " + simplePojo.getMessage());
    }
}
