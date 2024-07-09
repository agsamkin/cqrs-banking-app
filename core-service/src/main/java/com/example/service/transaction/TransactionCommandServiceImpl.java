package com.example.service.transaction;

import com.example.common.domain.model.Card;
import com.example.common.domain.model.Transaction;
import com.example.common.event.TransactionCreateEvent;
import com.example.service.card.CardService;
import com.example.service.event.EventService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private final EventService eventService;
    private final CardService cardService;

    @Override
    public void create(final Transaction transaction) {
        Card from = cardService.getByNumberAndDateAndCvv(
                transaction.getFrom().getNumber(),
                transaction.getFrom().getDate(),
                transaction.getFrom().getCvv()
        );
        Card to = cardService.getByNumberAndDate(
                transaction.getTo().getNumber(),
                transaction.getTo().getDate()
        );
        transaction.setFrom(from);
        transaction.setTo(to);
        TransactionCreateEvent event = new TransactionCreateEvent(transaction);
        eventService.create(event);
    }

}
