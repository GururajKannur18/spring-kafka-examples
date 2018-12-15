package com.demo.kafka.engine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducers {
	private static final Logger logger = LoggerFactory.getLogger(KafkaProducers.class);
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	public void sendMessages(String message) {
		logger.info("#### -> Producing message -> %s ", message);
		this.kafkaTemplate.send("users", message);
	}
}
