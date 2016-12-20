package removesettingmethod;

public class InterestAccount extends Account{
	
	private double _interestRate;

	InterestAccount(String id) {
		super(id);
	}

	InterestAccount(String id, double rate) {
		initializeId(id);
		_interestRate = rate;
	}
}
