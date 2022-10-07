package question1.main;

import java.util.Scanner;
import question1.exception.*;

public class Main {

    public static void main(String[] args) throws InvalidNameException {

      Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter your name");
            String fullName = sc.nextLine().trim();
            String nameArray[] = fullName.split(" ");
            
            if (nameArray.length != 2) {
                throw new InvalidNameException(fullName);
            }
            String name = fullName.toUpperCase();
            System.out.println("You have entered "+name);
            for (int i = 0; i < name.length(); i++) {
                // space
            	  if (name.charAt(i) == ' ') {
                      continue;
                  }
                if (name.charAt(i) >=
                        'A' && name.charAt(i) <= 'Z') {
                    continue;
                } else {
                    throw new InvalidNameException(fullName);
                }
            }

            System.out.println(fullName + " is a valid name");
            System.out.println("Do you want to enter another name (Y/N): " );
            String decision = sc.nextLine().toUpperCase();
            
            // exit from loop
            if(decision.equals("N")){
            	System.out.println("Program Terminated");
                break;
            }
        }
    }
}