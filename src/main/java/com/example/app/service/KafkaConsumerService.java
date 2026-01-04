package com.example.app.service;

import jakarta.annotation.PostConstruct;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @PostConstruct
    public void init() {
        System.out.println("Consumer service initialized");
    }

    @KafkaListener(topics = "karan-topic", groupId="karan-group")
    public void consume(String message){
        System.out.println("consumed message: "+message);
    }
}
