package com.example.service.card;

import com.example.common.domain.model.Card;
import com.example.service.CommandService;
import com.example.service.QueryService;

import java.util.UUID;

public interface CardService extends QueryService<Card>, CommandService<Card> {

    void createByClientId(UUID clientId);

    boolean existsByNumberAndDate(String number, String date);

    Card getByNumberAndDateAndCvv(String number, String date, String cvv);

    Card getByNumberAndDate(String number, String date);
}
