package com.example.service.account;

import com.example.domain.model.Account;
import com.example.event.AccountCreateEvent;
import com.example.repository.AccountRepository;
import com.example.service.event.EventService;
import com.example.service.event.EventServiceImpl;
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
