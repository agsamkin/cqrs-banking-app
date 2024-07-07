package com.example.service.transaction;

import com.example.domain.model.Transaction;
import com.example.event.TransactionCreateEvent;
import com.example.service.event.EventService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class TransactionCommandServiceImpl implements TransactionCommandService {

    private final EventService eventService;

    @Override
    public void create(Transaction transaction) {
        TransactionCreateEvent event = new TransactionCreateEvent(transaction);
        eventService.create(event);
    }

}
