package com.bc.kjmq.mq;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MessageSender.class);
    @Autowired
    RabbitTemplate rabbitTemplate;


    public void msgSender(String msg) {
        LOGGER.info(msg);
        rabbitTemplate.convertAndSend("kjmsg", msg);
    }

}
