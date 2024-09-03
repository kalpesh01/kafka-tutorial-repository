package com.deliveryboy.controller;

import com.deliveryboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("location")
public class KafkaController {

    @Autowired
    private KafkaService kafkaService;

    @GetMapping("/update")
    public ResponseEntity<?> updateLocation(){
        kafkaService.updateLocation("("+Math.round(Math.random() * 100)+","+Math.round(Math.random() * 100)+")");

        return new ResponseEntity<>(Map.of("Message","Location updates successfully"), HttpStatus.OK);
    }
}
