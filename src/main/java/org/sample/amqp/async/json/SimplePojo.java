package org.sample.amqp.async.json;

public class SimplePojo {
    private int key;
    private String message;
    
    public int getKey() {
        return key;
    }
    public void setKey(int key) {
        this.key = key;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}