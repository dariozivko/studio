package changebidirectionalassociationtounidirectional;

public class Order {
	private Customer _customer;
	
	Customer getCustomer() {
		return _customer;
	}
	void setCustomer (Customer arg) {
		if (_customer != null) 
			_customer.friendOrders().remove(this);
		_customer = arg;
		if (_customer != null) 
			_customer.friendOrders().add(this);
	}
	
	double getDiscountedPrice() {
		return getGrossPrice() * (1 - _customer.getDiscount());
		}
	
}
