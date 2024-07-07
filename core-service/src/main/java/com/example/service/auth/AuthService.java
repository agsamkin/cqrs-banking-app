package com.example.service.auth;

import com.example.common.domain.model.Client;
import com.example.web.dto.LoginRequestDto;
import com.example.web.dto.LoginResponseDto;

public interface AuthService {

    void register(Client client);
    LoginResponseDto login(LoginRequestDto loginRequestDto);

}
