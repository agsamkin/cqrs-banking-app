package com.example.service.client;

import com.example.common.domain.model.Client;
import com.example.service.QueryService;

import java.util.UUID;

public interface ClientQueryService extends QueryService<Client> {

    boolean existsByUsername(String username);

    Client getByUsername(String username);

    Client getByAccount(UUID accountId);

}
