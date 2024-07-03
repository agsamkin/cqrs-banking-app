package com.example.event;

import com.example.domain.aggregate.Aggregate;
import com.example.domain.model.Card;

import jakarta.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CardCreateEvent extends AbstractEvent {

    public CardCreateEvent(Card payload) {
        super(null, EventType.CARD_CREATE, payload);
    }

    @Override
    public void apply(Aggregate aggregate) {

    }

}
