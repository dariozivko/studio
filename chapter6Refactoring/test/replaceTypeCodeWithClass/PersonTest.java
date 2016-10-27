package replaceTypeCodeWithClass;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testName() {
		Person person = new Person(new BloodGroup(3));
		assertEquals(3, person.getBloodGroup().getCode());
	}
}