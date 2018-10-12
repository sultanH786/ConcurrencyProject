package market.entities;

import java.util.Queue;

import market.demo.Demo;
import market.utils.RandomNumberGenerator;

public class Customer implements Runnable{
	
	private Trolley trolley;
	
	public Trolley getTrolley() {
		return trolley;
	}

	public void setTrolley(Trolley trolley) {
		this.trolley = trolley;
	}

	RandomNumberGenerator generator;
	
	public Customer() {
		trolley = new Trolley();
		generator = new RandomNumberGenerator();
	}

	@Override
	public void run() {
		int prodCount = generator.getRandomNumberInRange(0, 200);
		trolley.setProductCount(prodCount);
		for(Counter counter : Demo.counters)
		{
			Queue<Customer> customers = counter.getCustomers();
			synchronized (customers) 
			{
				if(customers.size() < 6)
				{
					customers.add(this);
					// 
					customers.notifyAll();
				}
			}
		}
		
	}

}
