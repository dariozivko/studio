package replaceconditionalwithpolymorphism;

public abstract class EmployeeType {
	public static final int ENGINEER = 0;
	public static final int SALESMAN = 1;
	public static final int MANAGER = 2;

	abstract int getTypeCode();
	
	int payAmount(Employee employee) {
		switch (getTypeCode()) {
			case ENGINEER:
				return employee.getMonthlySalary();
			case SALESMAN:
				return employee.getMonthlySalary() + employee.getCommission();
			case MANAGER:
				return employee.getMonthlySalary() + employee.getBonus();
			default:
				throw new RuntimeException("Incorrect Employee");
		}
	}
}
