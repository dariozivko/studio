package replacedelegationwithinheritance;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void employeeTest() {
		Employee employee = new Employee();
		employee.setName("Dario");
		
		assertEquals("Emp: Dario", employee.toString());
	}
}