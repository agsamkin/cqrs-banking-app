package com.example.service.card;

import com.example.domain.model.Card;

import com.example.service.CommandService;
import com.example.service.QueryService;

public interface CardService extends QueryService<Card>, CommandService<Card> {
}
