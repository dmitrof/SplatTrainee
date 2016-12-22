package ru.splat.trmetadata;

/**
 * Created by Дмитрий on 22.12.2016.
 */
public class BillingTask extends LocalTask {
    private Long punterId;
    private Integer sum;

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public BillingTask(String service, Long transactionId, TaskTypesEnum type, Long _punterId, Integer sum) {
        super(service, transactionId, type);
        this.punterId = _punterId;
        this.sum = sum;
    }

    public Long getPunterId() {
        return punterId;

    }
}