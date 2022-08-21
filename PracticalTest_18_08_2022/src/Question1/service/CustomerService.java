package Question1.service;

import Question1.model.Customer;

public class CustomerService {
	
	
	public boolean isEligibleForVote(Customer s){
		boolean result = false;
		int Age = s.getAge();
		if (Age>=18){
			result = true;
		}
		else {
			result = false;	
		}
		return result;
		
		
	}
	
	

}