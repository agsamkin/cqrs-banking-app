package com.example.service.transaction;

import com.example.common.domain.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService {

    private final TransactionQueryService transactionQueryService;
    private final TransactionCommandService transactionCommandService;

    @Override
    public void create(Transaction transaction) {
        transactionCommandService.create(transaction);
    }

    @Override
    public Transaction getById(UUID id) {
        return transactionQueryService.getById(id);
    }

}
