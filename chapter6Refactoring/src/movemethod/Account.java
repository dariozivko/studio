package movemethod;

public class Account {
	
	private AccountType _type = new AccountType();
	private int _daysOverdrawn;
	
	double overdraftCharge() {
		if (_type.isPremium()) {
			double result = 10;
			if (_daysOverdrawn > 7) 
				result += (_daysOverdrawn - 7) * 0.85;
			return result;
		}
		else return _daysOverdrawn * 1.75;
	}
	
	double bankCharge() {
		double result = 4.5;
		if (_daysOverdrawn > 0) 
			result += overdraftCharge();
		return result;
	}

	public void setDaysOverdrawn(int days) {
		_daysOverdrawn = days;
	}

	public AccountType getType() {
		return _type;
	}

	public int getDaysOverdrawn() {
		return _daysOverdrawn;
	}

}
