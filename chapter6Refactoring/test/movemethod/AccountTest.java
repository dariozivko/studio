package movemethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void overdraftCharge() {
		Account account = new Account();
		account.setDaysOverdrawn(10);
		account.getType().setPremium();

		double overdraftCharge = account.getType().overdraftCharge(account);
		
		assertEquals(12.55, overdraftCharge, 0.0);
	}

}
