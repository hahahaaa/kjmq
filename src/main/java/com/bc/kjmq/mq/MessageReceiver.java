package com.bc.kjmq.mq;

import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReceiver {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(MessageReceiver.class);

    @RabbitListener(queues = "kjmsg")
    public void onMessage(String msg) {
        LOGGER.info(msg);
    }
}
