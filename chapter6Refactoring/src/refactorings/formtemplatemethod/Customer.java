package refactorings.formtemplatemethod;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
	
	private Vector<Rental> _rentals = new Vector<Rental>();

	public String statement() {
		return new TextStatement().value(this);
	}
	
	public String htmlStatement() {
		return new HtmlStatement().value(this);
	}

	public Enumeration getRentals() {
		return _rentals.elements();
	}

	public char[] getTotalFrequentRenterPoints() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public char[] getTotalCharge() {
		// TODO Auto-generated method stub
		return null;
	}

}
