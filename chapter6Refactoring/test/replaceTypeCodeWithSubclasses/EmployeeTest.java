package replaceTypeCodeWithSubclasses;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	/*
	@Test
	public void testName() {
		Employee employee = new Employee(2);
		assertEquals(Employee.MANAGER, employee.getType());
	}*/
	
	@Test
	public void postRefactoring() {
		Employee engineer = new Engineer();
		Employee salesman = new Salesman();
		Employee manager = new Manager();
		
		assertEquals(0, engineer.ENGINEER);
		assertEquals(1, salesman.SALESMAN);
		assertEquals(2, manager.MANAGER);
	}
}
