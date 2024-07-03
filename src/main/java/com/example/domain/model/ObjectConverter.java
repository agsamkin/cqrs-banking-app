package com.example.domain.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;

@RequiredArgsConstructor
@Converter
public class ObjectConverter implements AttributeConverter<Object, String> {

    private final ObjectMapper objectMapper;

    @SneakyThrows
    @Override
    public String convertToDatabaseColumn(Object attribute) {
        return objectMapper.writeValueAsString(attribute);
    }

    @Override
    public Object convertToEntityAttribute(String dbData) {
        return objectMapper.convertValue(dbData, Object.class);
    }

}
