package ru.splat.conventions;

/**
 * Created by Дмитрий on 22.12.2016.
 */
//виды локалтасков
public enum TaskTypesEnum {
    RESERVE, WITHDRAW, CANCEL_RESERVE,
    CHECK_PUNTER_LIMITS, UPDATE_PUNTER_COUNTER, CANCEL_PUNTER_LIMITS, CANCEL_PUNTER_COUNTER,
    CHECK_EVENT_LIMIT, CHECK_SELECTION_LIMIT, CANCEL_EVENT_LIMIT, CANCEL_SELECTION_LIMIT,
    ADD_BET, CHANGE_BET_STATE
}