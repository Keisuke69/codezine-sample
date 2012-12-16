package org.sample.amqp;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Receiver {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(SampleConfig.class);
        AmqpTemplate amqpTemplate = context.getBean(RabbitTemplate.class);
        SimplePojo simplePojo = (SimplePojo)amqpTemplate.receiveAndConvert();
        System.out.println("Receive message: key = " + simplePojo.getKey() + ", message = " + simplePojo.getMessage());
    }
}