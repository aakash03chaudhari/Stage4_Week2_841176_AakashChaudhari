package com.cognizant.account.dao;

import com.cognizant.account.entity.Account;

public interface AccountDao {

	public Account findByAccountNumber(long number);
}
