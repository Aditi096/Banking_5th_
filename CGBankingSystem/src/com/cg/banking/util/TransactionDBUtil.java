package com.cg.banking.util;

import java.util.HashMap;

import com.cg.banking.beans.Account;
import com.cg.banking.beans.Transaction;

public class TransactionDBUtil {
public static HashMap<Integer, Transaction> transactions= new HashMap<>();
	
	private static int TRANSACTION_ID_COUNTER=1000;

	public static int getTRANSACTION_ID_COUNTER() {
		return ++ TRANSACTION_ID_COUNTER;
	}

}
