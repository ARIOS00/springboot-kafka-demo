package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

@Configuration
public class ConsumerController {

    @KafkaListener(topics = "second-kafka-topic")
    public void consumerTopic(String s) {
        System.out.println("consumer: " + s);
    }

}
