package ru.splat.tm;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import com.google.protobuf.Message;

import javax.annotation.PostConstruct;

/**
 * Created by Дмитрий on 11.01.2017.
 */
public class TMConsumerActor extends UntypedActor {
    //KafkaConsumer<Long, Message> consumer;
    ActorRef tmFinalizer;



    public TMConsumerActor(ActorRef tmFinalizer) {

        this.tmFinalizer = tmFinalizer;
    }

    @Override
    public void onReceive(Object message) throws Throwable {
        if (message.equals("poll")) {
            System.out.println(message.toString());
        }
        else throw new Exception("TMConsumerActor: Unknown message type");
    }
}

/*class Ticker extends UntypedActor {

    @Override
    public void onReceive(Object o) throws Throwable {

    }
}*/
