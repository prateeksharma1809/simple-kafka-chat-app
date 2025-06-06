# Step 1:

Run the zookeeper and kafka 

```bash
docker-compose up -d
```

# Step 2:

Create topics in kafka using below commands

```bash
docker exec -it <container_id_of_kafka> bash
kafka-topics --create --topic chat-room --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1
```

# Step 3:

Run the producter and consumer in seperate terminals

```bash 
mvn clean compile

mvn exec:java -Dexec.mainClass="producer1.ChatProducer1"

mvn exec:java -Dexec.mainClass="consumer.ChatConsumer"

```

# Step 4:

Message from producer should reflect in consumer