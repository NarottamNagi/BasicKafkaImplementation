package com.src.KafkaExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.src.KafkaExample.service.KafkaProducerService;

@RestController
public class KafkaController {

	@Autowired
	KafkaProducerService service;
	
	@GetMapping("/producer/{name}")
	public void kafkaProducer(@PathVariable String name)
	{
		service.produceMsg(name);
	}
}
