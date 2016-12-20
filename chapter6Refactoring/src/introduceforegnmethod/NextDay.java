package introduceforegnmethod;

import java.util.Date;

public class NextDay {
	
	private Date previousEnd = new Date();
	
	Date newStart = nextDay(previousEnd);
	
	private static Date nextDay(Date arg) {
		return new Date(arg.getYear(),arg.getMonth(), arg.getDate() + 1);
	}
}
