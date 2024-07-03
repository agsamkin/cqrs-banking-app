package com.example.service.event;

import com.example.event.AbstractEvent;
import com.example.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public void create(AbstractEvent event) {
        eventRepository.save(event);
    }

}

