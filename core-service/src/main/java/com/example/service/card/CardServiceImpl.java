package com.example.service.card;

import com.example.common.domain.model.Card;
import com.example.common.domain.model.Client;
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
    public void create(Card card) {
        cardCommandService.create(card);
    }

    @Override
    public void createByClientId(UUID clientId) {
        Client client = clientService.getById(clientId);
        Card card = new Card(client.getAccount());
        cardCommandService.create(card);
    }

    @Override
    public Card getById(UUID id) {
        return cardQueryService.getById(id);
    }

    @Override
    public boolean existsByNumberAndDate(String number, String date) {
        return cardQueryService.existsByNumberAndDate(number, date);
    }

    @Override
    public Card getByNumberAndDateAndCvv(String number, String date, String cvv) {
        return cardQueryService.getByNumberAndDateAndCvv(number, date, cvv);
    }

}
