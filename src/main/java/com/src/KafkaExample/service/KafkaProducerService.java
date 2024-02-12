package com.src.KafkaExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
	
	@Autowired
	KafkaTemplate<String,String> kafkaTemplate;
	
	public void produceMsg(String name)
	{
		kafkaTemplate.send("producer_msg", name);
		
	}
	
	
	

}
