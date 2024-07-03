package com.example.service.account;

import com.example.domain.model.Account;
import com.example.service.CommandService;
import com.example.service.QueryService;

public interface AccountService extends QueryService<Account>, CommandService<Account> {
}
