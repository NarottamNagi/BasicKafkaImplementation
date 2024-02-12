package com.src.KafkaExample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerServices {
	
	@Autowired
	KafkaTemplate<String, String> template;
	
	@KafkaListener(topics = "producer_msg" , groupId = "producer_msg")
	public void kafkaLister(String name)
	{
		System.out.println("hello your msg is consume and ur name is " +name);
		
		template.send("consumer", "hey msg received properly");
	}

}
