package ru.splat.trmetadata;

import ru.splat.trenums.TaskTypesEnum;

/**
 * Created by Дмитрий on 22.12.2016.
 */
public class BetTask extends LocalTask {
    private final BetStatesEnum betState;
    private final Long punterId;

    public Long getPunterId() {
        return punterId;
    }

    public BetStatesEnum getBetState() {
        return betState;
    }

    public BetTask(String service, Long transactionId, TaskTypesEnum type, BetStatesEnum betState, Long punterId) {
        super(service, transactionId, type);
        this.betState = betState;
        this.punterId = punterId;
    }
}
