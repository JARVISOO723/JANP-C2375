package com.mybank.view;
import com.mybank.service.LoanAccountService;
public class MainView {
	public static void main(String args[]) {
   	 LoanAccountService obj1 = new LoanAccountService();
   	 System.out.println(obj1.calculateInterest(7,50,10,26));
   	
    }

}