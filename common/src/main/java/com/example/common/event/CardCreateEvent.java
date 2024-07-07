package com.example.common.event;

import com.example.common.domain.aggregate.Aggregate;
import com.example.common.domain.model.Card;
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
