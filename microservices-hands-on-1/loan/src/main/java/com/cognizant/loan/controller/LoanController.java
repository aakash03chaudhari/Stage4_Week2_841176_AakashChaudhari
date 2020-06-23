package com.cognizant.loan.controller;

import javax.validation.Valid;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.entity.Loan;
import com.cognizant.loan.service.LoanServiceImpl;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@Autowired
	private LoanServiceImpl loanServiceImpl;
	
	@GetMapping(value="/{number}",produces = MediaType.APPLICATION_JSON)
	public Loan getLoanById(@PathVariable @Valid long number) {
		
		return loanServiceImpl.getloanByNumber(number);
	}
}
