# Spring Cloud Stream With Kafka

This sample project demonstrates how to build real-time streaming applications using event-driven architecture, Spring Boot, Spring Cloud Stream, Apache Kafka, and Lombok.

By the end of this tutorial, you'll have a simple Spring Boot-based Greetings microservice running. that

1. Takes a message from a REST API,
2. Writes it to a Kafka topic,
3. Reads it from the topic, and
4. Outputs it to the console.

Let's get started!

# What Is Spring Cloud Streaming?
Spring Cloud Stream is a framework built upon Spring Boot for building message-driven microservices.

# What Is Kafka?
Kafka is a popular high performant and horizontally scalable messaging platform originally developed by LinkedIn.

Start Zookeeper and Kafka

# On Windows:

> bin\windows\zookeeper-server-start.bat config\zookeeper.properties
> bin\windows\kafka-server-start.bat config\server.properties

#On Linux or Mac:

> bin/zookeeper-server-start.sh config/zookeeper.properties
> bin/kafka-server-start.sh config/server.properties

@Ref: https://dzone.com/articles/spring-cloud-stream-with-kafka