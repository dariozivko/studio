package replaceconditionalwithpolymorphism;

public class Employee {
	
	private EmployeeType _type;
	private int _monthlySalary = 2000;
	private int _commission = 100;
	private int _bonus = 500;
	
	int payAmount() {
		switch (getType()) {
			case EmployeeType.ENGINEER:
				return _monthlySalary;
			case EmployeeType.SALESMAN:
				return _monthlySalary + _commission;
			case EmployeeType.MANAGER:
				return _monthlySalary + _bonus;
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}
	
	int getType() {
		return _type.getTypeCode();
	}

	public int getMonthlySalary() {
		return _monthlySalary;
	}

	public int getCommission() {
		return _commission;
	}

	public int getBonus() {
		return _bonus;
	}
}
