package ru.splat.trmetadata;

import ru.splat.trenums.TaskTypesEnum;

/**
 * Created by Дмитрий on 11.12.2016.
 */
//инкапсулирует одну из локальных операций транзакции
public abstract class LocalTask {
    private final String service; //поле, указывающее на то, к какому сервису относится операция
    private final Long transactionId;
    private final TaskTypesEnum type; //тип локальной транзакции

    public LocalTask(String service, Long transactionId, TaskTypesEnum type) {
        this.service = service;
        this.transactionId = transactionId;
        this.type = type;
    }

    public TaskTypesEnum getType() {
        return type;
    }
    public String getService() {
        return service;
    }
    public Long getTransactionId() {
        return transactionId;
    }



}