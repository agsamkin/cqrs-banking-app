package com.example.service.transaction;

import com.example.domain.model.Transaction;

import com.example.service.CommandService;
import com.example.service.QueryService;

public interface TransactionService extends QueryService<Transaction>, CommandService<Transaction> {
}
