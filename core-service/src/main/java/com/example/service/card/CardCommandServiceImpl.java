package com.example.service.card;

import com.example.common.domain.model.Card;
import com.example.common.event.CardCreateEvent;
import com.example.service.event.EventService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class CardCommandServiceImpl implements CardCommandService {

    private final EventService eventService;

    @Override
    public void create(Card card) {
        CardCreateEvent event = new CardCreateEvent(card);
        eventService.create(event);
    }

}
