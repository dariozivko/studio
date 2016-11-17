package replaceconditionalwithpolymorphism;

import static org.junit.Assert.*;

import org.junit.Test;

import replaceTypeCodeWithStateStrategy.Employee;
import replaceTypeCodeWithStateStrategy.EmployeeType;

public class EmployeeTest {

	@Test
	public void test() {
		Engineer engineer = new Engineer();
		Salesman salesman = new Salesman();
		Manager manager = new Manager();
		
		int engineerAmount = engineer.payAmount();
		int salesmanAmount = salesman.payAmount();
		int managerAmount = manager.payAmount();
		
		assertEquals(2000, engineerAmount);
		assertEquals(2100, salesmanAmount);
		assertEquals(2500, managerAmount);
	}

}
