package movemethod;

public class AccountType {
	
	private boolean _premium = false;

	public boolean isPremium() {
		return _premium;
	}
	
	public void setPremium() {
		_premium = true;
		
	}

	public double overdraftCharge(Account account) {
		if (isPremium()) {
			double result = 10;
			if (account.getDaysOverdrawn() > 7) 
				result += (account.getDaysOverdrawn() - 7) * 0.85;
			return result;
		}
		else return account.getDaysOverdrawn() * 1.75;
	}
}
