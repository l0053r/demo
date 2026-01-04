package com.example.app.controller;

import com.example.app.service.KafkaProducerService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private final KafkaProducerService producerService;
    public KafkaController(KafkaProducerService producerService){
        this.producerService = producerService;
    }

    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message){
        producerService.sendMessage("karan-topic", message);
        return "Message Published Successfully";
    }
}
