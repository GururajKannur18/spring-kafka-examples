package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.producer.Sender;

@SpringBootApplication
public class SpringKafkaHelloWorldApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringKafkaHelloWorldApplication.class, args);
	}
	
	@Autowired
	private Sender sender;

	@Override
	public void run(String... args) throws Exception {
		sender.send("Spring Kafka Producer and Consumer Example");
	}
}

