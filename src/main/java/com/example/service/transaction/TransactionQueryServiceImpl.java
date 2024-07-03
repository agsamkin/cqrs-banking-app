package com.example.service.transaction;

import com.example.domain.exception.ResourceNotFoundException;
import com.example.domain.model.Transaction;
import com.example.repository.TransactionRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionQueryServiceImpl implements TransactionQueryService {

    private final TransactionRepository transactionRepository;

    @Override
    public Transaction getById(UUID id) {
        return transactionRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
    
}
