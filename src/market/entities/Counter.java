package market.entities;

import java.util.LinkedList;
import java.util.Queue;



import market.utils.RandomNumberGenerator;

public class Counter implements Runnable{
	
	private Queue<Customer> customers = new LinkedList<>();
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
					Customer frontCustomer = customers.poll();
					customers.notifyAll();
					int prodCount = frontCustomer.getTrolley().getProductCount();
					for(int i = 0; i < prodCount; i++)
					{
						int time = generator.getRandomNumberInRange(1, 6);
						try 
						{
							System.out.println("Waits : "+time);
							Thread.sleep(time);
						}
						catch (InterruptedException e) 
						{
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
			
		}
		
	}

}
