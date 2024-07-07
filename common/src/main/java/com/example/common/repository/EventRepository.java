package com.example.common.repository;

import com.example.common.event.AbstractEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<AbstractEvent, Long> {
}
