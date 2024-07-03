package com.example.service.client;

import com.example.domain.model.Client;

import com.example.service.CommandService;
import com.example.service.QueryService;

public interface ClientService extends QueryService<Client>, CommandService<Client> {
}
