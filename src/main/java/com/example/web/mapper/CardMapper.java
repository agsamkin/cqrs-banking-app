package com.example.web.mapper;

import com.example.domain.model.Card;
import com.example.web.dto.CardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper extends Mappable<Card, CardDto> {
}
