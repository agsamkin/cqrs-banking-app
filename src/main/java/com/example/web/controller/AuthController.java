package com.example.web.controller;

import com.example.domain.model.Client;
import com.example.web.dto.ClientDto;
import com.example.web.dto.OnCreate;
import com.example.web.mapper.ClientMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;
    private final ClientMapper clientMapper;

    @PostMapping("/register")
    public void register(@RequestBody @Validated(OnCreate.class) final ClientDto clientDto) {
        Client client = clientMapper.fromDto(clientDto);
        authService.register(client);
    }

    @PostMapping("/register")
    public LoginResponseDto login(@RequestBody @Validated(OnCreate.class) final LoginRequestDto loginRequestDto) {
        authService.login(loginRequestDto);
    }

}
