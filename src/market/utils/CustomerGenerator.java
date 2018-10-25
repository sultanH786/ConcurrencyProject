package market.utils;

//import java.util.List;

import market.entities.Customer;
// class to create customer objects

public class CustomerGenerator  {
	
	RandomNumberGenerator generator; // create reference of RandomNumberGenerator class to generate random numbers
	
	// Constructor 
	public CustomerGenerator()
	{
		generator = new RandomNumberGenerator(); // create object of the class RandomNumberGenerator
	}
	
	public void generateCustomers() // methods to generate customer objects
	{
		final long timeInterval = 10000; // variable to store time interval after which next set of customers are generated
		// Anonymous runnable class
		Runnable runnable = new Runnable() {	  
        
		  public void run() { //  implement run method
	   
		    while (true) {  // to make the method infinite
		      System.out.println("Customer set is generated!!"); // to display message when customer set is generated
              int customerCount = generator.getRandomNumberInRange(1, 60); // variable to store count of customer generated
              System.out.println("Number of customers: "+customerCount); // to display number of customers inside the supermarket
              int time=0; // initially time is set to zero
              
              for(int i=1 ; i <=customerCount;i++) // loop to generate customer objects
              {
            	  int productCount = generator.getRandomNumberInRange(1, 200); // variable to store number of objects
            	  Customer customer = new Customer("Customer"+i,productCount,time); // creating customer objects
            	  new Thread(customer, "Customer : "+i).start();// starting customer thread

              }

		      try {

		       Thread.sleep(timeInterval); // sleep the customer thread for a definite time interval

		      } catch (InterruptedException e) {

		        e.printStackTrace();

		      }

		      }

		    }

		  };

		  

		  Thread thread = new Thread(runnable); // pass the runnable object to thread object 

		  thread.start(); // starting the anonymous runnable class thread
	}

}
