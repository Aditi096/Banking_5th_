package com.cg.banking.util;

import java.util.HashMap;

import com.cg.banking.beans.Account;

public class AccountDBUtil {
public static HashMap<Integer, Account> accounts= new HashMap<>();
	
	private static int ACCOUNT_ID_COUNTER=1000;

	public static int getACCOUNT_ID_COUNTER() {
		return ++ ACCOUNT_ID_COUNTER;
	}

}
