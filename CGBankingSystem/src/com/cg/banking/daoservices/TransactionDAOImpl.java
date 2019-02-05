package com.cg.banking.daoservices;

import java.util.ArrayList;
import java.util.List;

import com.cg.banking.beans.Transaction;
import com.cg.banking.util.AccountDBUtil;
import com.cg.banking.util.TransactionDBUtil;

public class TransactionDAOImpl implements TransactionDAO{

	@Override
	public Transaction save(Transaction transaction) {
		transaction.setTransactionId(TransactionDBUtil.getTRANSACTION_ID_COUNTER());
		TransactionDBUtil.transactions.put(transaction.getTransactionId(),transaction);//transactionDBUtil pending
		return transaction;
	}

	@Override
	public boolean update(Transaction transaction) {
		return false;
	}

	@Override
	public Transaction findOne(int transactionId) {
		return TransactionDBUtil.transactions.get(transactionId);
	}

	@Override
	public List<Transaction> findAll(int accountNo) {
		return new ArrayList<>(TransactionDBUtil.transactions.values());
	}

}
