package com.mybank.service;

public class LoanAccountService {

	private int loanId;
	private int loanAmount;
	private int rateOfInterest;
	private int time;
	 
	   
	  
	   
	public int calculateInterest(int loanId, int loanAmount, int rateOfInterest,int time) {
		int interest = loanAmount*rateOfInterest*time;
		return interest;
	   }
}
