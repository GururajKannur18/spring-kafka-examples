package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringKafkaTutorialspointApplication implements CommandLineRunner{

	private static final String TOPICS = "tutorialspoint";
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendMessage(String message) {
		kafkaTemplate.send(TOPICS, message);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaTutorialspointApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sendMessage("Hi Welcome to Spring For Apache Kafka @@@@@@@@@");
		sendMessage("Hello, Good Morning !!!");
	}
	
	@KafkaListener(topics = TOPICS, groupId = "group-id")
	public void listen(String message) {
		System.out.println("Received Messasge in group - group-id: " + message);
	}
}