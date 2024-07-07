package com.example.web.mapper;

import com.example.common.domain.model.Account;
import com.example.web.dto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AccountMapper extends Mappable<Account, AccountDto> {
}