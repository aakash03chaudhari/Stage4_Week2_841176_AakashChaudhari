package com.cognizant.loan.dao;

import com.cognizant.loan.entity.Loan;

public interface LoanDao {

	public Loan getLoanByNumber(long number);
}
