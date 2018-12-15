#Ref:

https://www.confluent.io/blog/apache-kafka-spring-boot-application

# Apache Kafka is:

- Scalable
- Fault tolerant
- A great publish-subscribe messaging system
- Capable of higher throughput compared with most messaging systems
- Highly durable
- Highly reliable
- High performant

That’s why I decided to use it in my projects. Based on my experience, I provide here a step-by-step guide on how to include Apache Kafka in your Spring Boot application so that you can start leveraging its benefits too.

@Ref: https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

# CURL

```
curl -X POST -F 'message=test' http://localhost:9000/kafka/publish
```