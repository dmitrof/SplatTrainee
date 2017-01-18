package ru.splat.tmkafka;

import com.google.protobuf.Message;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

/**
 * Created by Дмитрий on 06.01.2017.
 */
public class TMConsumerImpl implements TMConsumer {
    private final String[] topicsList =  {" BetService, BillingService, EventSerivce PunterService,"};
    private KafkaConsumer<Long, Message> consumer;

    public TMConsumerImpl() {
        Properties props = new Properties();
        props.put("bootstrap.servers", "localhost:9092");
        props.put("group.id", "test");
        props.put("enable.auto.commit", "true");
        props.put("auto.commit.interval.ms", "1000");
        props.put("session.timeout.ms", "30000");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        consumer = new KafkaConsumer<Long, Message>(props);
        consumer.subscribe(Arrays.asList("mytopic"));
        System.out.println("consumer here");
        

    }

    public ConsumerRecords<Long, Message> poll() {
        return consumer.poll(0);
    }
}
