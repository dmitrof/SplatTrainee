package ru.splat.util;


import com.google.protobuf.Message;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.kafka.common.TopicPartition;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;
import ru.splat.Punter.feautures.TransactionResult;
import ru.splat.Punter.protobuf.ProtoBufMessageDeserializer;
import ru.splat.Punter.protobuf.ProtoBufMessageSerializer;
import ru.splat.Punter.protobuf.PunterReq;
import ru.splat.Punter.protobuf.PunterRes;

import javax.annotation.PostConstruct;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.stream.Collectors;


public class PunterKafka implements Kafka<PunterReq.Punter>
{

    public KafkaProducer<Long, Message> producer;
    public KafkaConsumer<Long, PunterReq.Punter> consumer;
    public static final String TOPIC_REQUEST = "mytopic3";
    private static final String TOPIC_RESPONSE = "BillingRes";
    private static long currentOffset = 0;

    @PostConstruct
    @Override
    public void init()
   {
        Properties propsConsumer = new Properties();
        propsConsumer.put("bootstrap.servers", "localhost:9092");
        propsConsumer.put("group.id", "test");
        propsConsumer.put("enable.auto.commit", "false");
        // propsConsumer.put("session.timeout.ms", "30000");

        consumer = new KafkaConsumer(propsConsumer, new LongDeserializer(), new ProtoBufMessageDeserializer(PunterReq.Punter.getDefaultInstance()));
        consumer.subscribe(Arrays.asList(TOPIC_REQUEST));

        Properties propsProducer = new Properties();
        propsProducer.put("bootstrap.servers", "localhost:9092");
        propsProducer.put("acks", "all");
        propsProducer.put("retries", 0);
        propsProducer.put("batch.size", 16384);
        propsProducer.put("linger.ms", 1);
        propsProducer.put("buffer.memory", 33554432);

        producer = new KafkaProducer(propsProducer, new LongSerializer(), new ProtoBufMessageSerializer());

    }



    @Override
    public ConsumerRecords<Long, PunterReq.Punter> readFromKafka(long timeout)
    {
        if (consumer != null)
        {
            ConsumerRecords<Long,PunterReq.Punter> consumerRecords = consumer.poll(timeout);
            currentOffset = consumerRecords.count();
            return consumerRecords;
        }

        return null;
    }


    @Override
    public void resetConsumerToCommitedOffset()
    {
        if (consumer!=null)
        {
            TopicPartition partition = new TopicPartition(TOPIC_REQUEST, 0);
            consumer.seek(partition, consumer.committed(partition).offset()-currentOffset);
        }
    }

    @Override
    public void writeToKafka(List<TransactionResult> transactionResults) {

        List<Future> futureList = new ArrayList<>();
        while (!transactionResults.isEmpty())
        {
            futureList = transactionResults.stream().map(map ->
                    producer.send(new ProducerRecord<Long, Message>(TOPIC_RESPONSE,map.getTransactionId(), map.getResult())))
                    .collect(Collectors.toList());
            producer.flush();

            for (int i = 0; i < futureList.size(); i++)
            {
                try
                {
                    futureList.get(i).get();
                    transactionResults.remove(i);
                } catch (Exception e)
                {
                }
            }
        }
        currentOffset = 0;
    }




    @Override
    public void commitKafka()
    {
        if (consumer!=null)
        {
            consumer.commitSync();
            currentOffset = 0;
        }
    }
}
