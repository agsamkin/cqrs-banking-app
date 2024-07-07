package com.example.service.account;

import com.example.common.domain.model.Account;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountQueryService accountQueryService;
    private final AccountCommandService accountCommandService;

    @Override
    public void create(Account account) {
        accountCommandService.create(account);
    }

    @Override
    public Account getById(UUID id) {
        return accountQueryService.getById(id);
    }

}
