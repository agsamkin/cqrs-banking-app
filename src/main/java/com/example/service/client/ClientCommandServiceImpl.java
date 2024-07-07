package com.example.service.client;

import com.example.domain.model.Client;
import com.example.event.ClientCreateEvent;
import com.example.service.event.EventService;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class ClientCommandServiceImpl implements ClientCommandService {

    private final EventService eventService;

    @Override
    public void create(Client client) {
        ClientCreateEvent event = new ClientCreateEvent(client);
        eventService.create(event);
    }

}
