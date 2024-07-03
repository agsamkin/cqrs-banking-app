package com.example.repository;

import com.example.event.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
