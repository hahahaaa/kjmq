package com.bc.kjmq.jobs;

import com.bc.kjmq.dao.TestDao;
import com.bc.kjmq.entity.User;
import com.bc.kjmq.mq.MessageSender;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class KJMsgJob {
    public final static long TEN_SECONDS =  10 * 1000;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    MessageSender messageSender;

    @Autowired
    TestDao testDao;

    @Scheduled(fixedDelay=TEN_SECONDS)
    public void fixedDelayJob(){
        User user = testDao.findUserByName("酌一杯逍遥1");
        System.out.println(user);
        User user1 = testDao.findUserByName1("hahah");
        System.out.println(user1);
        messageSender.msgSender("测试发送消息");
    }
}
