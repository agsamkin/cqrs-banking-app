package com.example.service.event;

import com.example.common.event.AbstractEvent;
import com.example.common.repository.EventRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Transactional
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    @Override
    public void create(AbstractEvent event) {
        eventRepository.save(event);
    }

}

