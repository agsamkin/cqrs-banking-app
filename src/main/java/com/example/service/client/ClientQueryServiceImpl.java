package com.example.service.client;

import com.example.domain.exception.ResourceNotFoundException;
import com.example.domain.model.Client;
import com.example.repository.ClientRepository;

import jakarta.transaction.Transactional;
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

}
