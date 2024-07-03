package com.example.service.account;

import com.example.domain.exception.ResourceNotFoundException;
import com.example.domain.model.Account;
import com.example.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountQueryServiceImpl implements AccountQueryService {

    private final AccountRepository accountRepository;

    @Override
    public Account getById(UUID id) {
        return accountRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
    }
}
