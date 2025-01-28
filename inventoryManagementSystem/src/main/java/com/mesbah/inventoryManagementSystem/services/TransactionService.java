package com.mesbah.inventoryManagementSystem.services;


import com.mesbah.inventoryManagementSystem.dtos.Response;
import com.mesbah.inventoryManagementSystem.dtos.TransactionRequest;
import com.mesbah.inventoryManagementSystem.enums.TransactionStatus;

public interface TransactionService {
    Response purchase(TransactionRequest transactionRequest);

    Response sell(TransactionRequest transactionRequest);

    Response returnToSupplier(TransactionRequest transactionRequest);

    Response getAllTransactions(int page, int size, String filter);

    Response getAllTransactionById(Long id);

    Response getAllTransactionByMonthAndYear(int month, int year);

    Response updateTransactionStatus(Long transactionId, TransactionStatus status);
}
