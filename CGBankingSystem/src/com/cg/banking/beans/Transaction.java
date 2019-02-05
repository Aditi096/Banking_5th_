package com.cg.banking.beans;

public class Transaction {
	private int transactionId;
	private float amount;
	private String trasactionType;
	public Transaction() {}
	public Transaction( float amount, String trasactionType) {
		super();
		this.amount = amount;
		this.trasactionType = trasactionType;
	}
	public Transaction(int transactionId, float amount, String trasactionType) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.trasactionType = trasactionType;
		
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getTrasactionType() {
		return trasactionType;
	}
	public void setTrasactionType(String trasactionType) {
		this.trasactionType = trasactionType;
	}
	
	
}
