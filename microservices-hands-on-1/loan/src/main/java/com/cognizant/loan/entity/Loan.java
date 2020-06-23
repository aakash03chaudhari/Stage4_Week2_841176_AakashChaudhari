package com.cognizant.loan.entity;

import lombok.Data;

@Data
public class Loan {

	private long number;
	private String type;
	private double loan;
	private double emi;
	private int tenure;
}
