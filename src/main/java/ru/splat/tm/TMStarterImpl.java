package ru.splat.tm;

import com.google.protobuf.Descriptors;
import com.google.protobuf.Message;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.common.serialization.LongDeserializer;
import org.apache.kafka.common.serialization.LongSerializer;
import ru.splat.protobuf.*;
import ru.splat.trmetadata.*;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by Дмитрий on 11.12.2016.
 */
//класс, отправляющий таски во входящие топики сервисов
    //возможно, стоит добавить отправку сообщений пачкой
public class TMStarterImpl implements TMStarter {
    KafkaProducer<Long, Message> producer;


    public void processTransaction(TransactionMetadata trMetadata) {
        List<LocalTask> taskList = trMetadata.getLocalTasks();
        Long transactionId = ((TransactionMetadata) trMetadata).getTransactionId();
        System.out.println("PhstransactionId " + transactionId);
        //отправка кафке
        taskList.forEach(task->{
            try {
                writeToKafka(ProtobufBuilder.buildProtobuf(transactionId, task));
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }



    private void writeToKafka(Message message) {
        //producer.send();
    }

    public TMStarterImpl() {
        //инициализация продюсера
        Properties propsProducer = new Properties();
        propsProducer.put("bootstrap.servers", "localhost:9092");
        propsProducer.put("acks", "all");
        propsProducer.put("retries", 0);
        propsProducer.put("batch.size", 16384);
        propsProducer.put("linger.ms", 1);
        propsProducer.put("buffer.memory", 33554432);
        producer = new KafkaProducer(propsProducer, new LongSerializer(), new ProtoBufMessageSerializer());
    }

    private static class ProtobufBuilder {
        public ProtobufBuilder() {
        }
        //подготовить мессаги для оптравки
        //надо придумать, что делать с enum-и
        public static Message buildProtobuf(Long transactionId, LocalTask localTask) throws Exception{
            Message message;
            if (localTask instanceof BetTask) {
                //message = message.toBuilder()
                message = BetReqProto.BetReq.
                        newBuilder()
                            .setTransactionId(transactionId)
                            .setLocalTask(localTask.getType().toString())
                            .setBetState(((BetTask) localTask).getBetState().toString())
                            .setPunterId(((BetTask) localTask).getPunterId())
                        .build();
                return message;
            }
            if (localTask instanceof BillingTask) {
                message = BillingReqProto.BillingReq.
                        newBuilder()
                            .setTransactionId(transactionId)
                            .setLocalTask(localTask.getType().toString())
                            .setPunterId(((BillingTask) localTask).getPunterId())
                            .setSum(((BillingTask) localTask).getSum())
                        .build();
                return message;
            }
            if (localTask instanceof EventTask) {
                int i = 0;
                Descriptors.Descriptor descriptor = EventReqProto.EventReq.getDescriptor();
                Descriptors.FieldDescriptor servicesDescriptor = descriptor.findFieldByName("services");
                Descriptors.FieldDescriptor eventsDescriptor = descriptor.findFieldByName("");
                Descriptors.FieldDescriptor selectionDescriptor = descriptor.findFieldByName("");
                Message.Builder builder = EventReqProto.EventReq.
                        newBuilder()
                        .setTransactionId(transactionId)
                        .setLocalTask(localTask.getType().toString())
                        .setPunterId(((EventTask) localTask).getPunterId());
                Message.Builder eventIdBuilder = builder.newBuilderForField()
                        ((EventTask) localTask).getEventIdList().forEach(eventId->
                        //builder.setEventId()
                );

                message =
                return message;
            }
            if (localTask instanceof PunterTask) {
                message = EventReqProto.EventReq.
                        newBuilder()
                        .setTransactionId(transactionId)
                        .setLocalTask(localTask.getType().toString())
                        .setPunterId(((EventTask) localTask).getPunterId())
                        .setRepeatedField()
                        .s
                        .build();
                return message;
            }
            else {
                throw new Exception("Unknown task type!");
            }
        }
    }
}


