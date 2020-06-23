package com.cognizant.account.controller;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.AccountApplication;
import com.cognizant.account.entity.Account;
import com.cognizant.account.service.AccountServiceImpl;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	private static final Logger LOGGER = LoggerFactory.getLogger(AccountApplication.class);
	
	@Autowired
	private AccountServiceImpl accountServiceImpl;
	
	@GetMapping(value= "/{number}",produces = MediaType.APPLICATION_JSON)
	public Account getAccountByNumber(@PathVariable long number)
	{
		LOGGER.info("AccountController public Account getAccountByNumber(@PathVariable long number) START");
		LOGGER.info("AccountController public Account getAccountByNumber(@PathVariable long number) END");
		return accountServiceImpl.findByAccountNumber(number);
	}
}
