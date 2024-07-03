package com.example.web.mapper;

import com.example.domain.model.Client;
import com.example.web.dto.ClientDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper extends Mappable<Client, ClientDto> {
}