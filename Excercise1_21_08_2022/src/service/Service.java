package service;

public class Service {
	public static int calculateSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0||i%5==0)
			sum=sum+i;
		}return sum;
	}
}
