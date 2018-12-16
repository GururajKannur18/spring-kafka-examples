package com.demo.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.kafka.config.producer.Sender;
import com.demo.kafka.model.Car;

@SpringBootApplication
public class SpringBootKafkaJsonApplication implements CommandLineRunner {
	@Autowired
	private Sender sender;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaJsonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sender.send(Car.builder().id("1").make("ALTO").manufacturer("Maruti Suzuki").build());
	}
}

