package com.example.common.event;

import com.example.common.domain.aggregate.Aggregate;
import com.example.common.domain.model.Transaction;
import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TransactionCreateEvent extends AbstractEvent {

    public TransactionCreateEvent(Transaction payload) {
        super(null, EventType.TRANSACTION_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }

}
