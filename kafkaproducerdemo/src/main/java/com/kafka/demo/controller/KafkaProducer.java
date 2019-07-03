package com.kafka.demo.controller;

import com.kafka.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class KafkaProducer {
//We need to serialize the user object as kafka by defaults works for String object

    KafkaTemplate<String,User> kafkaTemplate;

    @Autowired
    KafkaProducer(KafkaTemplate kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;

    }

    private static String TOPIC="java_topic";

    @GetMapping("/user/{name}")
    public String post(@PathVariable("name") final String name){
    //kafkatemplete will send msg to topic the particular msg

        kafkaTemplate.send(TOPIC, new User(10, name, 20));
        return "Published Successfully";
    }

    @PostMapping("/user")
    public String post(@RequestBody User user){
        //kafkatemplete will send msg to topic the particular msg

        kafkaTemplate.send(TOPIC,user);
        return "Published Successfully";
    }
}
