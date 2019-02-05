package com.cg.banking.beans;

import java.util.List;

public class Account {
	public Account() {}
	private int accountNo;
	public Account(String accountType, float accountBalance) {
		super();
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public Account(int accountNo, int pinNumber, String accountType, String acccountStatus, float accountBalance,
			List<Transaction> transactions) {
		super();
		this.accountNo = accountNo;
		this.pinNumber = pinNumber;
		this.accountType = accountType;
		this.acccountStatus = acccountStatus;
		this.accountBalance = accountBalance;
		this.transactions = transactions;
	}
	public Account(int pinNumber, String accountType, String acccountStatus, float accountBalance) {
		super();
		this.pinNumber = pinNumber;
		this.accountType = accountType;
		this.acccountStatus = acccountStatus;
		this.accountBalance = accountBalance;
		
	}
	public int  getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getPinNumber() {
		return pinNumber;
	}
	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAcccountStatus() {
		return acccountStatus;
	}
	public void setAcccountStatus(String acccountStatus) {
		this.acccountStatus = acccountStatus;
	}
	public float getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	private int pinNumber;
	private String accountType,acccountStatus;
	private float accountBalance;
	private List<Transaction> transactions;
}
