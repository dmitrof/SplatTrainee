package ru.splat.trmetadata;

import ru.splat.trenums.TaskTypesEnum;

import java.util.List;

/**
 * Created by Дмитрий on 17.12.2016.
 */
public class EventTask extends LocalTask {
    private final List<Long> eventIdList;
    private final List<Long> selectionIdList;

    public EventTask(String service, Long transactionId, TaskTypesEnum type,
                     List<Long> eventIdList, List<Long> selectionIdList) {
        super(service, transactionId, type);
        this.eventIdList = eventIdList;
        this.selectionIdList = selectionIdList;
    }

    public List<Long> getEventIdList() {
        return eventIdList;
    }


    public List<Long> getSelectionIdList() {

        return selectionIdList;
    }


}
