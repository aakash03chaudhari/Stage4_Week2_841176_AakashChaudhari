package com.cognizant.account.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.entity.Account;
@Service
public class AccountDaoImpl implements AccountDao{

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	@Override
	public Account findByAccountNumber(long number) {
		LOGGER.info("AccountDaoImpl public Account findByAccountNumber(long number) START");
		ApplicationContext context = new ClassPathXmlApplicationContext("accounts.xml");
		List<Account> listOfAccount = context.getBean("accountList", java.util.ArrayList.class);
		
		((ConfigurableApplicationContext)context).close();		
		LOGGER.info("AccountDaoImpl public Account findByAccountNumber(long number) END");
		return listOfAccount.stream().filter(acc->acc.getNumber()==number).findFirst().orElseThrow();
	}

}
