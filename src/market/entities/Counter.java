package market.entities;

import java.util.LinkedList;
import java.util.Queue;



import market.utils.RandomNumberGenerator;

public class Counter implements Runnable{
	
	private Queue<Customer> customers = new LinkedList<>();
	private int counterId;
	private long totalWaitingTime; 
	private int totalCustomersProcessed;
	
	public Queue<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Queue<Customer> customers) {
		this.customers = customers;
	}

	private RandomNumberGenerator generator = new RandomNumberGenerator();

	@Override
	public void run() {
		while (true) {
			Customer frontCustomer = null;
			synchronized (customers) {
				if(customers.size() == 0)
				{
					try
					{
						customers.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else
				{				
					// update the text field textField1; set the customer.size() to textfield
					customers.notifyAll();	
				}				
			}
			//if(frontCustomer != null)
			//{
			    
				frontCustomer = customers.poll();
				if(frontCustomer != null)
				{
					System.out.println("Removed a customer and not null");
				}
				
				int counterId = this.counterId;
				switch (counterId) {
				case 1:
					// get jtextField 1 here and set customer.size()
					break;
				case 2:
					// get jtextField 2 here and set customer.size()
					break;
		
				default:
					break;
				}
				int prodCount = frontCustomer.getTrolley().getProductCount();
				for(int i = 0; i < prodCount; i++)
				{
					int time = generator.getRandomNumberInRange(1, 6);
					try 
					{
						//System.out.println("Waits : "+time);
						Thread.sleep(time);
					}
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			//}
			// long endTimeForCustomer =  ..
			// 10:32
			
		}
		
	}

	public int getCounterId() {
		return counterId;
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}
	
	

}
