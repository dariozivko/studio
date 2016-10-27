package replaceTypeCodeWithStateStrategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void managerSalary() {
		Employee engineer = new Employee(EmployeeType.ENGINEER);
		Employee salesman = new Employee(EmployeeType.SALESMAN);
		Employee manager = new Employee(EmployeeType.MANAGER);
		
		int engineerAmount = engineer.payAmount();
		int salesmanAmount = salesman.payAmount();
		int managerAmount = manager.payAmount();
		
		assertEquals(2000, engineerAmount);
		assertEquals(2100, salesmanAmount);
		assertEquals(2500, managerAmount);
	}
}