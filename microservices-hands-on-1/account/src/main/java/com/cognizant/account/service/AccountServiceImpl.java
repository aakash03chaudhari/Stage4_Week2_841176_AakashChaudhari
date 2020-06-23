package com.cognizant.account.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.dao.AccountDaoImpl;
import com.cognizant.account.entity.Account;

@Service
public class AccountServiceImpl implements AccountService{

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	
	@Autowired
	private AccountDaoImpl accountDaoImpl;
	@Override
	public Account findByAccountNumber(long number) {
		LOGGER.info("AccountServiceImpl public Account findByAccountNumber(long number) START");
		Account account = accountDaoImpl.findByAccountNumber(number);
		
		LOGGER.debug("Account :{}",account);
		
		LOGGER.info("AccountServiceImpl public Account findByAccountNumber(long number) START");
		return account;
	}

}
