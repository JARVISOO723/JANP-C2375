package org.practicaltest.question2;
import java.util.Scanner;

public class CheckPasswordMain {
	static Scanner scanner=new Scanner(System.in);
	
	static void displaySubMenu() {
		System.out.println("1. Add CheckPassword");
		System.out.println("2. Display All CheckPasswords");
		System.out.println("Enter your choice");
		int subMenuChoice=scanner.nextInt();
		scanner.nextLine();
		switch(subMenuChoice) {
		case 1:
			if(CheckPasswordView.addId())
				System.out.println("Bus Added Sucessfully");
			break;
		case 2:
			CheckPassword book[]=CheckPasswordView.displayId();
			for(CheckPassword localCheckPassword:book) {
				if(localCheckPassword!=null)
				System.out.println(localCheckPassword);
				else
					break;
			}
			break;
			default: 
				System.out.println("Not a valid input");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int choice;
		do {
			
			System.out.println("1. Start Application");
			System.out.println("2. Stop Application");
			System.out.println("Enter your choice");
			choice=scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1:
				displaySubMenu();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Not a valid input");
			}
		}while(true);
	}

}
