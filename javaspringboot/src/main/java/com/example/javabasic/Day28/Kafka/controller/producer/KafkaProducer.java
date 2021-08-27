package com.example.javabasic.Day28.Kafka.controller.producer;

import com.example.javabasic.Day28.Kafka.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    @Autowired
    private KafkaTemplate<String,String> stringKafkaTemplate;

    private static final String TOPIC_JSON = "Kafka_Example";
    private static final String TOPIC_STRING = "Kafka_Example_STRING";

    @GetMapping("/json/{name}")
    public String postJson(@PathVariable("name") final String name) {

        kafkaTemplate.send(TOPIC_JSON, new User(name, "Technology", 12000L));

        return " JSON Published successfully";
    }

    @GetMapping("/string/{name}")
    public String postString(@PathVariable("name") final String name) {

        stringKafkaTemplate.send(TOPIC_STRING, name);

        return "STRING Published successfully";
    }
}
