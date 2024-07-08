package com.example.common.service.client;

import com.example.common.domain.exception.ResourceNotFoundException;
import com.example.common.domain.model.Client;
import com.example.common.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ClientQueryServiceImpl implements ClientQueryService {

    private final ClientRepository clientRepository;

    @Override
    public Client getById(UUID id) {
        return clientRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public boolean existsByUsername(String username) {
        return clientRepository.existsByUsername(username);
    }

    @Override
    public Client getByUsername(String username) {
        return clientRepository.findByUsername(username)
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public Client getByAccount(final UUID accountId) {
        return clientRepository.findByAccountId(accountId)
                .orElseThrow(ResourceNotFoundException::new);
    }

}
