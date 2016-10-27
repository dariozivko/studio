package replaceTypeCodeWithStateStrategy;

public class Employee {
	
	private final int _monthlySalary = 2000;
	private final int _commission = 100;
	private final int _bonus = 500;
	
	private EmployeeType _type;
	
	Employee (int type) {
		setType (type);
	}
	
	int getType() {
		return _type.getTypeCode();
	}
	
	void setType(int arg) {
		_type = EmployeeType.newType(arg);
	}
	
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
}
