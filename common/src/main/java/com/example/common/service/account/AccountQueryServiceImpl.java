package com.example.common.service.account;

import com.example.common.domain.exception.ResourceNotFoundException;
import com.example.common.domain.model.Account;
import com.example.common.repository.AccountRepository;
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
