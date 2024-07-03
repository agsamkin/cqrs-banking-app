package com.example.web.mapper;

import com.example.domain.model.Transaction;
import com.example.web.dto.TransactionDto;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface TransactionMapper
        extends Mappable<Transaction, TransactionDto> {
}