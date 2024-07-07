package com.example.service.account;

import com.example.common.domain.model.Account;
import com.example.common.event.AccountCreateEvent;
import com.example.service.event.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountCommandServiceImpl implements AccountCommandService {

    private final EventService eventService;

    @Override
    public void create(Account account) {
        AccountCreateEvent event = new AccountCreateEvent(account);
        eventService.create(event);
    }

}
