package ru.splat.trstate;

import ru.splat.trenums.LocalStatesEnum;
import ru.splat.trenums.TaskTypesEnum;

import java.util.Map;

/**
 * Created by Дмитрий on 22.12.2016.
 */
public class TransactionState {
    Long transactionId;
    Map<TaskTypesEnum, LocalStatesEnum> localStates;

    public TransactionState(Long transactionId, Map<TaskTypesEnum, LocalStatesEnum> localStates) {
        this.transactionId = transactionId;
        this.localStates = localStates;
    }
}
