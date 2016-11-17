package movefield;

public class Account {
	
	private AccountType _type = new AccountType();
	
	double interestForAmountPerDays (double amount, int days) {
		return getInterestRate() * amount * days / 365;
	}

	public double getInterestRate() {
		return _type.getInterestRate();
	}

	public void setInterestRate(double interestRate) {
		_type.setInterestRate(interestRate);
	}
	
	
}