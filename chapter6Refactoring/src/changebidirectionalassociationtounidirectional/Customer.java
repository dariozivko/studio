package changebidirectionalassociationtounidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer {
	private Set<Order> _orders = new HashSet<Order>();
	
	void addOrder(Order arg) {
		arg.setCustomer(this);
	}
	
	Set friendOrders() {
		/** should only be used by Order */
		return _orders;
	}

}
