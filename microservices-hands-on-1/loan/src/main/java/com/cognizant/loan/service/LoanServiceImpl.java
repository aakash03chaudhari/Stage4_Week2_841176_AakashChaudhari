package com.cognizant.loan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.dao.LoanDaoImpl;
import com.cognizant.loan.entity.Loan;

@Service
public class LoanServiceImpl implements LoanService {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);
	@Autowired
	private LoanDaoImpl loanDaoImpl;

	@Override
	public Loan getloanByNumber(long number) {
		LOGGER.info("AccountServiceImpl public Account findByAccountNumber(long number) START");
		Loan loan = loanDaoImpl.getLoanByNumber(number);
		LOGGER.debug("Loan :{}",loan);
		
		LOGGER.info("AccountServiceImpl public Account findByAccountNumber(long number) START");
		return loan;
	}
}
