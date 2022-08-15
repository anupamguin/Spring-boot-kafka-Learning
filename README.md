# Spring-boot-kafka-Learning
Before run this project we have to run kafka server up .

1) Open the folder where Apache Kafka is installed.
cd Downloads/kafka_2.3.1/bin

2) Start Apache Zookeeper.
./zookeeper-server-start.sh ../config/zookeeper.properties

3) Start the Kafka server.
./kafka-server-start.sh ../config/server.properties

# Then Run this java project

If we want to create Topic from terminal then
 bin/kafka-topics.sh --create --topic javaguides --bootstrap-server localhost:9092

If we want to create Producer from terminal then
 bin/kafka-console-producer.sh --topic javaguides --bootstrap-server localhost:9092
 
If we want to consume from terminal then 
 bin/kafka-console-consumer.sh --topic javaguides --from-beginning --bootstrap-server localhost:9092



Let's understand the above spring boot provided Kafka properties:

spring.kafka.consumer.group-id - specifies a unique string that identifies the consumer group this consumer belongs to.
spring.kafka.consumer.auto-offset-reset property - specifies what to do when there is no initial offset in Kafka or if the current offset does not exist anymore on the server (e.g. because that data has been deleted):
earliest: automatically reset the offset to the earliest offset
latest: automatically reset the offset to the latest offset
none: throw an exception to the consumer if no previous offset is found for the consumer’s group
anything else: throw an exception to the consumer.
spring.kafka.consumer.key-deserializer - specifies the deserializer class for keys.
spring.kafka.consumer.value-deserializer - specifies the deserializer class for values.
spring.kafka.producer.key-deserializer - specifies the serializer class for keys.
spring.kafka.producer.value-deserializer - specifies the serializer class for values.


