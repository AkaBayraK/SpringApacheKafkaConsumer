package com.example.listeners;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.dto.ProductDTO;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ConsumerListener {

	//String türünde göderilen mesaj test
	/*
    @KafkaListener(topics = "${apache.kafka.topic.name}")
    public void consume(ConsumerRecord<String, String> payload){
        System.out.println(payload.value());
    }
    */
    
    //Object türünde gönderilen mesaj test
    @KafkaListener(topics = "${apache.kafka.topic.name}")
    public void consume(ConsumerRecord<String, ProductDTO> payload){
        System.out.println(payload.value());
    }


}
