package market.entities;

import java.util.Queue;
import java.util.LinkedList;
//import java.util.Random;
import market.demo.Demo;
import market.utils.RandomNumberGenerator;

public class Customer implements Runnable{
	
	private String customerName;
	private int productCount;
	private long processingTime;
	public static int custCount;
	public Queue<Customer> customerList=new LinkedList<>();
	private Trolley trolley;
	
	
	
public Customer() {
		
	}

	public Customer(String customerName,int productCount,int time) {
		this.customerName=customerName;
		this.productCount=productCount;
		this.processingTime=time;
		trolley = new Trolley();
		generator = new RandomNumberGenerator();
	}
	
	
	RandomNumberGenerator generator;
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

	public void setProcessingTime(long totalWaitingTime) {
		this.processingTime = totalWaitingTime;
	}
	
	

	@Override
	public void run() {
		
		int prodCount = generator.getRandomNumberInRange(0, 200);
		trolley.setProductCount(prodCount);
		
		boolean foundQueue = false;
		while(!foundQueue)
		{
			for(Counter counter : Demo.counters)
			{
				Queue<Customer> customers = counter.getCustomers();
				synchronized (customers) 
				{
					if((customers.size() < 6))
					{
						customers.add(this);
						System.out.println( this.customerName+ " joined the Queue"+counter.getCounterId()+ " with "+ this.productCount+ " items");
						foundQueue = true;
						customers.notifyAll();
						break;
					}
					else
					{
						customers.notifyAll();
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



