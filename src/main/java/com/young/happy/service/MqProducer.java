package com.young.happy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MqProducer {
    @Value("${spring.kafka.topic}")
    private String topic;
    @Autowired
    private KafkaTemplate<Object,Object> template;

    public void sendMessage(Object msg){
        template.send(topic,msg.toString());
    }
}
