package movefield;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void interestForAmount_days() {
		Account account = new Account();
		account.setInterestRate(5.0);
		
		double interestForAmountPerDays = account.interestForAmountPerDays(50.0,10);
		
		assertEquals(6.8, interestForAmountPerDays, 0.05);
	}

}
