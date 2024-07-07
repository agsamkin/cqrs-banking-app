package com.example.service.auth;

import com.example.domain.exception.ResourceAlreadyExistsException;
import com.example.domain.model.Client;
import com.example.service.client.ClientService;
import com.example.web.dto.LoginRequestDto;
import com.example.web.dto.LoginResponseDto;
import com.example.web.security.jwt.JwtProperties;
import com.example.web.security.jwt.TokenType;
import io.github.ilyalisov.jwt.config.TokenParameters;
import io.github.ilyalisov.jwt.service.TokenService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final TokenService tokenService;
    private final ClientService clientService;
    private final JwtProperties jwtProperties;
    private final AuthenticationManager authenticationManager;
    private final PasswordEncoder passwordEncoder;

    @Override
    public LoginResponseDto login(final LoginRequestDto request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        LoginResponseDto response = new LoginResponseDto();
        Client client = clientService.getByUsername(request.getUsername());
        response.setId(client.getId());

        response.setAccess(
                tokenService.create(
                        TokenParameters.builder(
                                        request.getUsername(),
                                        TokenType.ACCESS.name(),
                                        jwtProperties.getAccessDuration()
                                )
                                .build()
                )
        );

        response.setRefresh(
                tokenService.create(
                        TokenParameters.builder(
                                        request.getUsername(),
                                        TokenType.REFRESH.name(),
                                        jwtProperties.getRefreshDuration()
                                )
                                .build()
                )
        );

        return response;
    }

    @Override
    public void register(final Client client) {
        if (clientService.existsByUsername(client.getUsername())) {
            throw new ResourceAlreadyExistsException();
        }

        client.setPassword(passwordEncoder.encode(client.getPassword()));
        clientService.create(client);
    }

}
