package market.entities;

import java.util.Queue;
import java.util.LinkedList;
//import java.util.Random;
import market.demo.Demo;
import market.utils.RandomNumberGenerator;
// Customer class 
public class Customer implements Runnable{
	
	private String customerName; // to store customer name
	private int productCount; // to store product count
	private long processingTime; //to calculate processing time for each customer 
	public static int custCount; // to store customer count
	public Queue<Customer> customerList=new LinkedList<>();
	private Trolley trolley;
	
	
	
public Customer() {
	// constructor to do the basic stuff
		
	}

	public Customer(String customerName,int productCount,int time) { // parameterized constructor 
		this.customerName=customerName;
		this.productCount=productCount;
		this.processingTime=time;
		trolley = new Trolley();
		generator = new RandomNumberGenerator();
	}
	
	// Getter methods of attributes
	RandomNumberGenerator generator; // Create object reference for RandomNumberGenerator
	public String getCustomerName() {
		return customerName;
	}

	public int getProductCount() {
		return productCount;
	}

	public static int getCustCount() {
		return custCount;
	}
	
	public long getProcessingTime() {
		return processingTime;
	}
    // setter method
	public void setProcessingTime(long totalWaitingTime) {
		this.processingTime = totalWaitingTime;
	}
	
	

	@Override
	public void run() {
		
		int prodCount = generator.getRandomNumberInRange(1, 200);
		trolley.setProductCount(prodCount);
		
		boolean foundQueue = false;
		while(!foundQueue)
		{
			for(Counter counter : Demo.counters) // iterating through the counter list 
			{
				Queue<Customer> customers = counter.getCustomers();// doubt
				synchronized (customers) //locking the customer queue of each counter
				{
					if((customers.size() < 6)) // check if the size of the counter is less than 6 
					{
						customers.add(this); // join the queue
						System.out.println( this.customerName+ " joined the Queue"+counter.getCounterId()+ " with "+ this.productCount+ " items");
						foundQueue = true; // variable true
						customers.notifyAll(); // notify other threads
						break;
					}
					else
					{
						customers.notifyAll(); // doubt
					}
					
				}
			}	
		}
	}
	
	public Trolley getTrolley() {
		return trolley;
	}

	public void setTrolley(Trolley trolley) {
		this.trolley = trolley;
	}


}





// q 1  0
// q 2  0
// q 3  0
// q 4  0



