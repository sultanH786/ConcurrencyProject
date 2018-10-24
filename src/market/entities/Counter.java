package market.entities;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


import market.demo.Demo;
import market.utils.RandomNumberGenerator;

public class Counter implements Runnable{
	
	private Queue<Customer> customers = new LinkedList<>();
	private int counterId;
	private long totalWaitingTime; 
	private int totalCustomersProcessed;
	private RandomNumberGenerator generator = new RandomNumberGenerator();
	
	public int getCounterId() {
		return counterId;
	}

	public void setCounterId(int counterId) {
		this.counterId = counterId;
	}
	
	
	
	
	public Queue<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Queue<Customer> customers) {
		this.customers = customers;
	}

	

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
				int counterId = this.counterId;
				
				
				switch (counterId) {
				case 1:
					// get jtextField 1 here and set customer.size()
					Demo.mainUi.getTextField().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 2:
					// get jtextField 2 here and set customer.size()
					Demo.mainUi.getTextField_1().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 3:
					Demo.mainUi.getTextField_2().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 4:
					Demo.mainUi.getTextField_3().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 5:
					Demo.mainUi.getTextField_4().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 6:
					Demo.mainUi.getTextField_5().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 7:
					Demo.mainUi.getTextField_6().setText(""+customers.size());
					System.out.println(customers.size());
					break;
				case 8:
					Demo.mainUi.getTextField_7().setText(""+customers.size());
					System.out.println(customers.size());
					break;
					
		
				default:
					break;
				}
				if(frontCustomer != null)
				{
				
				
				int prodCount = frontCustomer.getProductCount();
				for(int i = 0; i < prodCount; i++)
				{
					int time = generator.getRandomNumberInRange(1, 5);
					//System.out.println(time);
					totalWaitingTime+=time;
					frontCustomer.setProcessingTime(totalWaitingTime);
					
					try 
					{
						Thread.sleep(time*1000);
					}
					catch (InterruptedException e) 
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(frontCustomer.getCustomerName()+" checked out from the Queue" +this.counterId+" in "+this.totalWaitingTime+" milliseconds");
				
			//}
			// long endTimeForCustomer =  ..
			// 10:32
			
		}
		
	}

	
	
	}	

}
