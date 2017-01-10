package ru.splat.trmetadata;

import java.util.List;

/**
 * Created by Дмитрий on 11.12.2016.
 */
public class TransactionMetadata {
    private final Long transactionId;
    private final List<LocalTask> localTasks;

    public TransactionMetadata(Long transactionId, List<LocalTask> localTasks) {
        this.transactionId = transactionId;
        this.localTasks = localTasks;
    }
    public Long getTransactionId() {
        return transactionId;
    }
    public List<LocalTask> getLocalTasks() {
        return localTasks;
    }
}

