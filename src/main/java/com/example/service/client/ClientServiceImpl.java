package com.example.service.client;

import com.example.domain.model.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientQueryService clientQueryService;
    private final ClientCommandService clientCommandService;

    @Override
    public void create(Client client) {
        clientCommandService.create(client);
    }

    @Override
    public Client getById(UUID id) {
        return clientQueryService.getById(id);
    }

}
