package com.example.common.service.client;

import com.example.common.domain.model.Client;
import com.example.common.service.QueryService;

import java.util.UUID;

public interface ClientQueryService extends QueryService<Client> {

    boolean existsByUsername(String username);

    Client getByUsername(String username);

    Client getByAccount(UUID accountId);

}
