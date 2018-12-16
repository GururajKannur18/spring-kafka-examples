package com.demo.kafka.config.receiver;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;

import com.demo.kafka.model.Car;

public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

	private CountDownLatch latch = new CountDownLatch(1);

	public CountDownLatch getLatch() {
		return latch;
	}
	
	@Value("${kafka.topic-json}")
	private String jsonTopic;

	@KafkaListener(topics = "jsont")
	public void receive(Car car) {
		LOGGER.info("received car='{}'", car.toString());
		//latch.countDown();
	}
}