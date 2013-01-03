package org.sample.amqp.async;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Pruducer {
    public static void main(String[] args){
        new AnnotationConfigApplicationContext(ProducerConfig.class);
    }
}
