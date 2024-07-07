package com.example.eventhandler.handler;

import com.example.common.domain.model.Account;
import com.example.common.event.AccountCreateEvent;
import com.example.eventhandler.service.account.AccountService;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component("ACCOUNT_CREATE")
@RequiredArgsConstructor
public class AccountCreateEventHandler implements EventHandler {

    private final AccountService accountService;
    private final Gson gson;

    @Transactional
    @Override
    public void handle(
            final JsonObject object,
            final Acknowledgment acknowledgment
    ) {
        AccountCreateEvent event = gson.fromJson(
                object,
                AccountCreateEvent.class
        );
        Account account = gson.fromJson(
                (String) event.getPayload(),
                Account.class
        );
        accountService.create(account);
        acknowledgment.acknowledge();
    }

}