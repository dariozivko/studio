package refactorings.substitutemethod;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class SubstituteMethodTest extends SubstituteMethod {

	@Test
	public void foundPersonTest() {
		SubstituteMethod substitutemethod = new SubstituteMethod();
		String[] person = new String[]{"Don", "Diego", "Della", "Vega"};
		assertEquals("Don", substitutemethod.foundPerson(person));
	}
	
	@Test
	public void foundPersonNewTest() {
		SubstituteMethod substitutemethod = new SubstituteMethod();
		String[] person = new String[]{"Don", "Diego", "Della", "Vega"};
		assertEquals("Don", substitutemethod.foundPersonNew(person));
	}

}
