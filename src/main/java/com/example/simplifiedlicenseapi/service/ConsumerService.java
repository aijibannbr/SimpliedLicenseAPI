package com.example.simplifiedlicenseapi.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    @KafkaListener(topicPartitions = {@TopicPartition(topic =
            "license-topic-2", partitions = {"0"})}, groupId =
            "license-consumer-group")
    public void consumePartition0(String message) {
        System.out.printf("Consumer for Partition 0 received: %s%n",
                message);
    }

    @KafkaListener(topicPartitions = {@TopicPartition(topic =
            "license-topic-2", partitions = {"1"})}, groupId =
            "license-consumer-group")
    public void consumePartition1(String message) {
        System.out.printf("Consumer for Partition 1 received: %s%n",
                message);
    }

    @KafkaListener(topicPartitions = {@TopicPartition(topic =
            "license-topic-2", partitions = {"2"})}, groupId =
            "license-consumer-group")
    public void consumePartition2(String message) {
        System.out.printf("Consumer for Partition 2 received: %s%n",
                message);
    }
}