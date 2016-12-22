package ru.splat.trmetadata;

import java.util.List;

/**
 * Created by Дмитрий on 17.12.2016.
 */
public class EventTask extends LocalTask {
    private List<Long> eventIdList;
    private List<Long> selectionIdList;

    public List<Long> getEventIdList() {
        return eventIdList;
    }

    public void setEventIdList(List<Long> eventIdList) {
        this.eventIdList = eventIdList;
    }

    public void setSelectionIdList(List<Long> selectionIdList) {
        this.selectionIdList = selectionIdList;
    }

    public List<Long> getSelectionIdList() {

        return selectionIdList;
    }

    public EventTask(String service, Long transactionId, TaskTypesEnum type,
                     List<Long> eventIdList, List<Long> selectionIdList) {
        super(service, transactionId, type);
        this.eventIdList = eventIdList;
        this.selectionIdList = selectionIdList;
    }
}
