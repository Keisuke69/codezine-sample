package org.sample.amqp.async.json;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Consumer {
    public static void main(String[] args){
        new AnnotationConfigApplicationContext(SampleListenerConfig.class);
    }
}
