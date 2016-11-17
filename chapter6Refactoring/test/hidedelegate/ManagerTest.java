package hidedelegate;

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void personTest() {
		Department dep = new Department(new Person("Pippo"));
		Person employee = new Person("Pluto");
		
		employee.setDepartment(dep);
		Person manager = employee.getManager();
		
		assertEquals("Pippo", manager.getName());
	}

}
