package market.demo;

import java.util.ArrayList;
import java.util.List;
import market.entities.Counter;
import market.ui.MainUi;
import market.utils.CustomerGenerator;

public class Demo {
	private CustomerGenerator generator = new CustomerGenerator(); // generate customers
	public static List<Counter> counters = new ArrayList<>();// to store the set of counter objects
	public static MainUi mainUi; // GUI Object reference
	public static void main(String[] args) {
		
	    mainUi = new MainUi(); // create UI Object
		mainUi.setVisible(true); // setting the UI object visible 
		Demo demo = new Demo(); // creating main class reference and object
		demo.generateCounters(); // method to generate the checkout counter objects
		demo.generator.generateCustomers(); // to generate the customer objects
		
	}
	// method to generate checkout counters
	void generateCounters()
	{
		for(int i = 1; i <= 8; i++) 
		{
			Counter counter = new Counter(); // create counter objects
			counter.setCounterId(i); // setting counter ID for each object
			counters.add(counter); // adding each object to the counter to the counter list
			new Thread(counter,"Counter ID : "+(i)).start(); // starting the counter thread
		}
	}
	
	
	
	

}
