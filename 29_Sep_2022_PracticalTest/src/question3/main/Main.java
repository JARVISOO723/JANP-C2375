package question3.main;

public class Main {
	  public static void main(String[] args)
	    {
	        Runnable myThread = () ->
	        {
	            Thread.currentThread().setName("Welcome to lambda expression thread");
	            System.out.println(
	            Thread.currentThread().getName());
	        };
	        Thread thread = new Thread(myThread);
	        thread.start();
	    }
	}

