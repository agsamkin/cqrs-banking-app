package com.example.service.card;

import com.example.common.domain.model.Card;
import com.example.common.domain.model.Client;
import com.example.common.service.card.CardQueryService;
import com.example.service.client.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CardServiceImpl implements CardService {

    private final CardQueryService cardQueryService;
    private final CardCommandService cardCommandService;
    private final ClientService clientService;

    @Override
    public void create(final Card card) {
        cardCommandService.create(card);
    }

    @Override
    public void createByClientId(final UUID clientId) {
        Client client = clientService.getById(clientId);
        Card card = new Card(client.getAccount());
        cardCommandService.create(card);
    }

    @Override
    public Card getById(final UUID id) {
        return cardQueryService.getById(id);
    }

    @Override
    public boolean existsByNumberAndDate(final String number, final String date) {
        return cardQueryService.existsByNumberAndDate(number, date);
    }

    @Override
    public Card getByNumberAndDateAndCvv(final String number, final String date, final String cvv) {
        return cardQueryService.getByNumberAndDateAndCvv(number, date, cvv);
    }

    @Override
    public Card getByNumberAndDate(final String number, final String date) {
        return cardQueryService.getByNumberAndDate(number, date);
    }

}
