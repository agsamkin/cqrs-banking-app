package com.example.repository;

import com.example.domain.model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {
}
