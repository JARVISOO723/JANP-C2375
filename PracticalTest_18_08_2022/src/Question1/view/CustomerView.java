package Question1.view;
import Question1.model.Customer;
import Question1.service.CustomerService;

public class CustomerView {
	
	public static void main(String[] arg) {
		
		Customer Customer1 = new Customer(1,"abc",18);
		CustomerService CustService1 = new CustomerService();
		boolean value = CustService1.isEligibleForVote(Customer1);
		if (value) {
			CustService1.isEligibleForVote(Customer1);
			System.out.println(CustService1.isEligibleForVote(Customer1));
			System.out.println("you are elegible for Voting");
		}
		else{System.out.println(CustService1.isEligibleForVote(Customer1));
			System.out.println("you are not elegible for Voting");
		}
		
		
		
	}
	

}