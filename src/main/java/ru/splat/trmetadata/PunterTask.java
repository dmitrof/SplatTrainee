package ru.splat.trmetadata;

import ru.splat.trenums.TaskTypesEnum;

/**
 * Created by Дмитрий on 17.12.2016.
 */
public class PunterTask extends LocalTask {
    private final Long punterId;

    public PunterTask(String service, Long transactionId, TaskTypesEnum type, Long _punterId) {
        super(service, transactionId, type);
        this.punterId = _punterId;
    }

    public Long getPunterId() {
        return punterId;

    }
}
