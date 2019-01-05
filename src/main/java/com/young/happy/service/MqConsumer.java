package com.young.happy.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MqConsumer {

    @KafkaListener(topics = {"${spring.kafka.topic}"},groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord record){
        System.out.println("key是："+record.key()+" 消息是："+record.value()+"时间是："+record.timestamp()+"位移是："+record.offset()+"分区是："+record.partition());
    }
}
