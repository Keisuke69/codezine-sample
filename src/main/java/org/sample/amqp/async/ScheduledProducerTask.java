package org.sample.amqp.async;

import java.util.Date;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

public class ScheduledProducerTask {
    @Autowired
    RabbitTemplate rabbitTemplate;
    
    @Scheduled(fixedDelay=5000)
    public void sendMessage() {
        String message = "Message sent at " + new Date();
        rabbitTemplate.convertAndSend(message);
        System.out.println(message);
    }
}
