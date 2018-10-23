package market.utils;

import java.util.List;

import market.entities.Customer;

public class CustomerGenerator  {
	
	RandomNumberGenerator generator;
	
	
	public CustomerGenerator()
	{
		generator = new RandomNumberGenerator();
	}
	
	public void generateCustomers()
	{
		final long timeInterval = 10000;
		Runnable runnable = new Runnable() {	  

		  public void run() {
		    while (true) {
		      System.out.println("Customer set is generated!!");
              int customerCount = generator.getRandomNumberInRange(0, 60);
              for(int i=1 ; i <=customerCount;i++)
              {
            	  int productCount = generator.getRandomNumberInRange(0, 200);
            	  Customer customer = new Customer("Customer "+i,productCount);
            	  new Thread(customer, "Customer : "+i).start();
              }

		      try {

		       Thread.sleep(timeInterval);

		      } catch (InterruptedException e) {

		        e.printStackTrace();

		      }

		      }

		    }

		  };

		  

		  Thread thread = new Thread(runnable);

		  thread.start();
	}

}
