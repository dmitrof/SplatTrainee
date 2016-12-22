package ru.splat.trmetadata;

/**
 * Created by Дмитрий on 17.12.2016.
 */
public class PunterTask extends LocalTask {
    private Long punterId;

    public PunterTask(String service, Long transactionId, TaskTypesEnum type, Long _punterId) {
        super(service, transactionId, type);
        this.punterId = _punterId;
    }

    public void setPunterId(Long punterId) {
        this.punterId = punterId;
    }

    public Long getPunterId() {
        return punterId;

    }
}
