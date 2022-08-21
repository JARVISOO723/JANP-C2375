
public class switchcasedemo {
	void start() {
		System.out.println("Start");
	}
	void displayInstructions() {
		System.out.println("Instructions");
	}
	void exit() {
		System.out.println("exit");
	}
	public static void main (String args[]) {
		switchcasedemo obj= new switchcasedemo();
		int num =1;
		switch(num) {
		case 1: obj.start();
				break;
		
		case 2: obj.displayInstructions();
				break;
		
		case 3: obj.exit();
				break;
		
		default: System.out.println("Invalid Input");
		
		}
		
		
		
	}
	

}
