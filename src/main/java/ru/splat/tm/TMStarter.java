package ru.splat.tm;

import ru.splat.trmetadata.TransactionMetadata;

/**
 * Created by Дмитрий on 11.12.2016.
 */
public interface TMStarter {

    void processTransaction(TransactionMetadata trMetadata);
}
