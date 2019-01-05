package com.young.happy.controller;

import com.young.happy.service.MqConsumer;
import com.young.happy.service.MqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/mq")
public class TestController {
    @Autowired
    private MqProducer producer;

    @Autowired
    private MqConsumer consumer;

    @PostMapping("/produce")
    public void testKafka(@RequestBody Map<String,Object> msg){
        producer.sendMessage(msg);
    }
}
