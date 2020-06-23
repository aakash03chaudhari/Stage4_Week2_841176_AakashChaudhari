package com.cognizant.loan.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.loan.LoanApplication;
import com.cognizant.loan.entity.Loan;

@Service
public class LoanDaoImpl implements LoanDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(LoanApplication.class);
	
	@Override
	public Loan getLoanByNumber(long number) {
		LOGGER.info("LoanDaoImpl public Loan getLoanByNumber(long number) START");
		ApplicationContext context = new ClassPathXmlApplicationContext("loans.xml");
		List<Loan> listOfLoan = context.getBean("loanList", java.util.ArrayList.class);
		
		((ConfigurableApplicationContext)context).close();		
		LOGGER.info("LoanDaoImpl public Loan getLoanByNumber(long number) END");
		return listOfLoan.stream().filter(loan->loan.getNumber()==number).findFirst().orElseThrow();
	}

}
