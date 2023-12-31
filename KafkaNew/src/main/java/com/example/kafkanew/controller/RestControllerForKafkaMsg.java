package com.example.kafkanew.controller;

import com.example.kafkanew.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

    @Autowired
    Producer producer;
    @GetMapping("/producerMsg")
    public void getMessageFromClient(){
        producer.sendMsgToTopic("Dummy11");
    }
}
