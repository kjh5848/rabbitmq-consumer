package com.rabbitmq.rabbitmqConsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class RabbitConsumer {

    @RabbitListener(queues = "repo-updates")
    public void receiveMessage(String rawMessage) {
        log.info("readme.md 파일이 수정되었습니다.");
    }
}
