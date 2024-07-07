package com.example.web.security.service;

import com.example.web.dto.CardDto;
import com.example.web.security.SecurityUser;

import java.util.UUID;

public interface SecurityService {

    SecurityUser getUserFromRequest();

    boolean canAccessClient(UUID clientId);

    boolean canAccessCard(UUID cardId);

    boolean canAccessCard(CardDto card);

    boolean canAccessTransaction(UUID transactionId);

}
