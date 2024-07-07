package com.example.service.client;

import com.example.domain.model.Client;
import com.example.service.QueryService;

public interface ClientQueryService extends QueryService<Client> {

    boolean existsByUsername(String username);

    Client getByUsername(String username);
}
