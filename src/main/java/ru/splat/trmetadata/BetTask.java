package ru.splat.trmetadata;

/**
 * Created by Дмитрий on 22.12.2016.
 */
public class BetTask extends LocalTask {
    private BetStatesEnum betState;
    private Long punterId;

    public Long getPunterId() {
        return punterId;
    }

    public void setPunterId(Long punterId) {
        this.punterId = punterId;
    }

    public BetStatesEnum getBetState() {
        return betState;
    }

    public void setBetState(BetStatesEnum betState) {
        this.betState = betState;
    }

    public BetTask(String service, Long transactionId, TaskTypesEnum type, BetStatesEnum betState, Long punterId) {
        super(service, transactionId, type);
        this.betState = betState;
        this.punterId = punterId;
    }
}
