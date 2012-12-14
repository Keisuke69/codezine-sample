package org.sample.amqp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Sender {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);
        AmqpTemplate amqpTemplate = context.getBean(RabbitTemplate.class);
        amqpTemplate.convertAndSend("Hello world");
        System.out.println("Sent message.");
    }
}