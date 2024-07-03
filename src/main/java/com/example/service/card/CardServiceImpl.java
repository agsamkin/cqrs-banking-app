package com.example.service.card;

import com.example.domain.model.Card;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardQueryService cardQueryService;
    private final CardCommandService cardCommandService;

    @Override
    public void create(Card card) {
        cardCommandService.create(card);
    }

    @Override
    public Card getById(UUID id) {
        return cardQueryService.getById(id);
    }

}
