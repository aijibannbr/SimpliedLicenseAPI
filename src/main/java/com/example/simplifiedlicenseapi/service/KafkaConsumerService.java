package com.example.simplifiedlicenseapi.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    private final LicenseTypeService licenseTypeService;

    public KafkaConsumerService(LicenseTypeService licenseTypeService) {
        this.licenseTypeService = licenseTypeService;
    }

    @KafkaListener(topics = "license-topic", groupId =
            "simplified-license-group")
    public void consumeMessage(String message) {
        String[] parts = message.split(",");
        if (parts.length != 3) {
            System.err.println("Invalid message format.");
            return;
        }
        licenseTypeService.saveLicenseType(parts[0], parts[1],
                Boolean.parseBoolean(parts[2]));
    }
}
