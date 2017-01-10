package ru.splat.trmetadata;

import ru.splat.trenums.TaskTypesEnum;

/**
 * Created by Дмитрий on 22.12.2016.
 */
public class BillingTask extends LocalTask {
    private final Long punterId;
    private final Integer sum;

    public BillingTask(String service, Long transactionId, TaskTypesEnum type, Long _punterId, Integer sum) {
        super(service, transactionId, type);
        this.punterId = _punterId;
        this.sum = sum;
    }
    public Integer getSum() {
        return sum;
    }

    public Long getPunterId() {
        return punterId;
    }
}