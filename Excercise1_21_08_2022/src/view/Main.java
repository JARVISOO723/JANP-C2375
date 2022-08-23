package view;
import service.Service;
public class Main {
	public static void main(String args[]){
		int a =10;
		Service obj1=new Service();
		int n=obj1.calculateSum(a);
		System.out.println("The sum of first "+a+" natural numbers which are divisible by 3 and 5 are "+n);
	}
	
}
