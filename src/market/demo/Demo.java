package market.demo;

import java.util.ArrayList;
import java.util.List;

import market.entities.Counter;
import market.ui.MainUi;
import market.utils.CustomerGenerator;

public class Demo {
	CustomerGenerator generator = new CustomerGenerator();
	public static List<Counter> counters = new ArrayList<>();
	public static MainUi mainUi;
	
	public static void main(String[] args) {
		mainUi = new MainUi();
		mainUi.setVisible(true);
		Demo demo = new Demo();
		demo.generateCounters();
		demo.generator.generateCustomers();
		
	}
	
	void generateCounters()
	{
		for(int i = 0; i < 8; i++)
		{
			Counter counter = new Counter();
			counter.setCounterId(i+1);
			counters.add(counter);
			new Thread(counter).start();
		}
	}
	
	
	
	

}
