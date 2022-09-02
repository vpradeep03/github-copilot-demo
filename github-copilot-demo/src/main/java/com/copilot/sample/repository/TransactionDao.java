package com.copilot.sample.repository;

import com.copilot.sample.model.Transaction;

public interface TransactionDao {
    // Accept Debit transaction only if there is balance on customer account
    Transaction debit(Transaction transaction) throws CustomerNotFoundException;
    // Accept Credit transaction only if there is balance on customer account
Transaction credit(Transaction transaction) throws CustomerNotFoundException;
//get current balance on customer account
Double getBalance(String customerId);

}
