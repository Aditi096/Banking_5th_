package com.cg.banking.daoservices;

import java.util.List;

import com.cg.banking.beans.Account;
import com.cg.banking.util.AccountDBUtil;


public class AccountDAOImpl implements AccountDAO{

	@Override
	public Account save(Account account) {
		account.setAccountNo(AccountDBUtil.getACCOUNT_ID_COUNTER());
		AccountDBUtil.accounts.put(account.getAccountNo(),account);
		return account;
		
	}

	@Override
	public boolean update(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account findOne(int accountId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
