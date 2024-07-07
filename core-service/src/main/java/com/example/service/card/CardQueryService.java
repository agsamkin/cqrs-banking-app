package com.example.service.card;

import com.example.common.domain.model.Card;
import com.example.service.QueryService;

public interface CardQueryService extends QueryService<Card> {
    boolean existsByNumberAndDate(String number, String date);
    Card getByNumberAndDateAndCvv(String number, String date, String cvv);
}
