package ru.splat.tm;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;
import com.google.protobuf.Message;
import ru.splat.conventions.LocalStatesEnum;
import ru.splat.conventions.TaskTypesEnum;
import ru.splat.trmetadata.TransactionMetadata;
import ru.splat.trstate.TransactionState;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Дмитрий on 11.12.2016.
 */
public class TMFinalizerImpl extends UntypedActor implements TMFinalizer {
    private Map<Long, TransactionState> transactionStates;
    private ActorRef registry;

    public TMFinalizerImpl(ActorRef registry) {
        this.registry = registry;
        transactionStates = new HashMap<>();
    }

    public void run() {

    }

    private  Boolean stateExists(Long transactionId) {
        return transactionStates.containsKey(transactionId);
    }

    public void createTransactionState(TransactionMetadata trMetadata) {
        Long trId = trMetadata.getTransactionId();
        System.out.println("Creating state for: " + trId);
        if (!stateExists(trId)) {
            Map<TaskTypesEnum, LocalStatesEnum> localStates = new HashMap<>();
            trMetadata.getLocalTasks().forEach(localTask -> localStates.put(localTask.getType(), LocalStatesEnum.PROCESSING));
            TransactionState transactionState = new TransactionState(trId, localStates);
        }
        else {
            System.out.println("State for " + trId + " already exists!");
        }
    }

    public void onReceive(Object message) throws Exception {
        if (message instanceof TransactionMetadata) {
            createTransactionState((TransactionMetadata)message);
        }
        if (message instanceof Message) {
            
        }
        else {
            unhandled(message);
        }
        //if (message instanceof )
    }
}
