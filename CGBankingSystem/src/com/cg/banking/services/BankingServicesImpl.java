package com.cg.banking.services;

import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.daoservices.AccountDAO;
import com.cg.banking.daoservices.AccountDAOImpl;
import com.cg.banking.daoservices.TransactionDAO;
import com.cg.banking.daoservices.TransactionDAOImpl;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;



public class BankingServicesImpl implements BankingServices{

	private AccountDAO accountDao=new AccountDAOImpl();
	private TransactionDAO transactionDao = new TransactionDAOImpl(); 	

	@Override
	public Account openAccount(int pinNumber, String accountType, String acccountStatus, float accountBalance)
			throws InvalidAmountException, InvalidAccountTypeException, BankingServicesDownException {
		Account account=new Account(pinNumber, accountType, acccountStatus, accountBalance);
		account=accountDao.save(account);
		return account;
	}

	@Override
	public float depositAmount(int accountNo, float amount)
			throws AccountNotFoundException, BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float withdrawAmount(int accountNo, float amount, int pinNumber) throws InsufficientAmountException,
			AccountNotFoundException, InvalidPinNumberException, BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean fundTransfer(int accountNoTo, long accountNoFrom, float transferAmount, int pinNumber)
			throws InsufficientAmountException, AccountNotFoundException, InvalidPinNumberException,
			BankingServicesDownException, AccountBlockedException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account getAccountDetails(int accountNo) throws AccountNotFoundException, BankingServicesDownException {
		Account account=accountDao.findOne(accountNo);
		if(account==null)throw
		new AccountNotFoundException("This account number "+ accountNo+" is not found");
		return account;
		
		
	}

	@Override
	public List<Transaction> getAccountAllTransaction(int accountNo)
			throws BankingServicesDownException, AccountNotFoundException {
		return transactionDao.findAll(accountNo);
	}

	@Override
	public String accountStatus(int accountNo)
			throws BankingServicesDownException, AccountNotFoundException, AccountBlockedException {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
