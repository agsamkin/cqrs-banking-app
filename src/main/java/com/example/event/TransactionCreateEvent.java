package com.example.event;

import com.example.domain.aggregate.Aggregate;
import com.example.domain.model.Transaction;

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
