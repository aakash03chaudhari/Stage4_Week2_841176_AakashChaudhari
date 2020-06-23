package com.cognizant.account.service;

import com.cognizant.account.entity.Account;

public interface AccountService {

	public Account findByAccountNumber(long number);
}
