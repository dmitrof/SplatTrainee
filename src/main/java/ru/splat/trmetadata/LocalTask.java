package ru.splat.trmetadata;

/**
 * Created by Дмитрий on 11.12.2016.
 */
//инкапсулирует одну из локальных операций транзакции
public abstract class LocalTask {
    private String service; //поле, указывающее на то, к какому сервису относится операция
    private Long transactionId;
    private TaskTypesEnum type;

    public LocalTask(String service, Long transactionId, TaskTypesEnum type) {
        this.service = service;
        this.transactionId = transactionId;
        this.type = type;
    }

    public TaskTypesEnum getType() {
        return type;
    }

    public void setType(TaskTypesEnum type) {
        this.type = type;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }


}