package com.example.service.auth;

import com.example.domain.exception.ResourceAlreadyExistsException;
import com.example.domain.model.Client;
import com.example.service.client.ClientService;
import com.example.web.dto.LoginRequestDto;
import com.example.web.dto.LoginResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final ClientService clientService;

    @Override
    public void register(Client client) {
        if (clientService.existsByUsername(client.getUsername())) {
            throw new ResourceAlreadyExistsException();
        }

        client.setPassword(client.getPassword());
        clientService.create(client);
    }

    @Override
    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        return null;
    }

}
