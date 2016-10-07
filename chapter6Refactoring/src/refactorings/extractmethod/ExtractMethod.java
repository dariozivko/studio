package refactorings.extractmethod;

import java.util.Enumeration;
import java.util.Vector;

public class ExtractMethod {
	private Vector<Order> _orders = new Vector<Order>();
	private String _name;

	public ExtractMethod(String name) {
		_name = name;
	}
	void printOwing(double previousAmount) {
		Order order1 = new Order(7);
		Order order2 = new Order(23);
		Order order3 = new Order(10);
		_orders.add(order1);
		_orders.add(order2);
		_orders.add(order3);
		
		printBanner();
		double outstanding = getOutstanding(previousAmount * 1.2);
		printDetails(outstanding);
		}
	
	private double getOutstanding(double previous) {
		Enumeration<Order> e = _orders.elements();
		double result = 0.0;
		
		while (e.hasMoreElements()) {
			Order each = (Order) e.nextElement();
			result += each.getAmount();
		}
		return result;
	}
	
	private void printDetails(double outstanding) {
		System.out.println ("name:" + _name);
		System.out.println ("amount:" + outstanding);
	}
	
	private void printBanner() {
		System.out.println ("**************************");
		System.out.println ("***** Customer Owes ******");
		System.out.println ("**************************");
	}
}
