# Ref:
https://memorynotfound.com/spring-kafka-consume-producer-example/

Logs:

```
[ntainer#0-0-C-1] o.a.k.c.c.internals.AbstractCoordinator  : [Consumer clientId=consumer-2, groupId=helloworld] Successfully joined group with generation 1
[ntainer#0-0-C-1] o.a.k.c.c.internals.ConsumerCoordinator  : [Consumer clientId=consumer-2, groupId=helloworld] Setting newly assigned partitions [helloworld.t-0]
[           main] o.a.kafka.common.utils.AppInfoParser     : Kafka version : 2.0.1
[           main] o.a.kafka.common.utils.AppInfoParser     : Kafka commitId : fa14705e51bd2ce5
[ad | producer-1] org.apache.kafka.clients.Metadata        : Cluster ID: p1ZAt95KRqSLqLURXvVkCQ
[ntainer#0-0-C-1] o.a.k.c.consumer.internals.Fetcher       : [Consumer clientId=consumer-2, groupId=helloworld] Resetting offset for partition helloworld.t-0 to offset 0.
[ntainer#0-0-C-1] o.s.k.l.KafkaMessageListenerContainer    : partitions assigned: [helloworld.t-0]
[ntainer#0-0-C-1] com.example.consumer.Receiver            : received payload='Spring Kafka Producer and Consumer Example'
```