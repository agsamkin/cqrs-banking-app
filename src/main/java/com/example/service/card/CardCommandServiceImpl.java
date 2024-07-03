package com.example.service.card;

import com.example.domain.model.Card;
import com.example.event.CardCreateEvent;
import com.example.service.event.EventService;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardCommandServiceImpl implements CardCommandService {

    private final EventService eventService;

    @Override
    public void create(Card card) {
        CardCreateEvent event = new CardCreateEvent(card);
        eventService.create(event);
    }

}
