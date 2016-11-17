package replaceinheritancewithdelegation;

import static org.junit.Assert.*;

import org.junit.Test;

public class VectorTest {

	@Test
	public void vectorTest() {
		MyStack stack = new MyStack();
		stack.push("primo");
		
		assertEquals("primo", stack.pop());
	}
}
