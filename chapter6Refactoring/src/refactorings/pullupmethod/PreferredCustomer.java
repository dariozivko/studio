package refactorings.pullupmethod;

import java.util.Date;

public class PreferredCustomer {
	
	protected double chargeFor(Date lastBillDate, Date date) {
		return (date.getTime() - lastBillDate.getTime()) * 0.5;
	}

}
