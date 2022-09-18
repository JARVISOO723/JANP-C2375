package org.practicaltest.question2;

import java.util.Scanner;
	public class CheckPasswordView {		
		static Scanner scanner=new Scanner(System.in);
	public static boolean addId() {
		System.out.println("Enter a Username");
		String userName=scanner.nextLine();
		System.out.println("Enter a Password");
		String password=scanner.nextLine();
		CheckPassword id=new CheckPassword(userName,password);
		CheckPasswordService.addId(id);
		return true;
	}

		public static CheckPassword[] displayId() {
			return CheckPasswordService.displayId();
		}
	}