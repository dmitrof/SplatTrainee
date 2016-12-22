package ru.splat.trmetadata;

import java.util.List;

/**
 * Created by Дмитрий on 11.12.2016.
 */
public class TransactionMetadata {
    private Long transactionId;
    private List<LocalTask> localTasks;
    private boolean cancel; //поле указывающее на то, является ли транзакция "отменой"

    public TransactionMetadata(Long transactionId, List<LocalTask> localTasks) {
        this.transactionId = transactionId;
        this.localTasks = localTasks;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public List<LocalTask> getLocalTasks() {
        return localTasks;
    }

    public void setLocalTasks(List<LocalTask> localTasks) {
        this.localTasks = localTasks;
    }


    public boolean isCancel() {
        return cancel;
    }

    public void setCancel(boolean cancel) {
        this.cancel = cancel;
    }

}

