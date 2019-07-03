//
//
//import com.kafka.demo.model.User;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Service;
//
//@Service
//public class KafkaConsumerListener {
//
//    @KafkaListener(topics = "java_topic", group = "group_json",containerFactory = "userKafkaListenerFactory")
//public void consumeUser(User user){
//        System.out.println("User consumed" + user);
//}
//
//
////    @KafkaListener(topics = "Kafka_Example_json", group = "group_json",
////            containerFactory = "userKafkaListenerFactory")
////    public void consumeJson(User user) {
////        System.out.println("Consumed JSON Message: " + user);
////    }
//}



package com.kafka.demo.listener;

import com.kafka.demo.model.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerListener {

    @KafkaListener(topics = "kafka_string", groupId = "group_id")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }


    @KafkaListener(topics = "kafka_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumeJson(User user) {
        System.out.println("Consumed JSON Message: " + user);
    }
}
