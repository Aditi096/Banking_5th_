package com.cg.banking.services;

import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;
import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;

public interface BankingServices {

	Account openAccount( int pinNumber, String accountType, String acccountStatus, float accountBalance) 
	throws InvalidAmountException,InvalidAccountTypeException,BankingServicesDownException;
	
	float depositAmount(int accountNo,float amount)
	throws AccountNotFoundException,BankingServicesDownException,AccountBlockedException;
	
	float withdrawAmount(int accountNo,float amount,int pinNumber)
	throws InsufficientAmountException,AccountNotFoundException,InvalidPinNumberException,BankingServicesDownException,AccountBlockedException;
	
	boolean fundTransfer(int accountNoTo,long accountNoFrom,float transferAmount,int pinNumber)
	throws InsufficientAmountException,AccountNotFoundException,InvalidPinNumberException,BankingServicesDownException,AccountBlockedException;
	
	Account getAccountDetails(int accountNo)
	throws AccountNotFoundException,BankingServicesDownException;
	
	List<Transaction> getAccountAllTransaction(int accountNo)
	throws BankingServicesDownException,AccountNotFoundException;
	
	public String accountStatus(int accountNo)
	throws BankingServicesDownException,AccountNotFoundException,AccountBlockedException;
	
}
