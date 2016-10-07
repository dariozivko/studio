package refactorings.extractmethod;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import org.junit.Test;

import refactorings.extractmethod.ExtractMethod;

public class ExtractMethodTest {
	
	@Test
	public void printOwning() {
		OutputStream out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		
		ExtractMethod refactoring = new ExtractMethod("Dario");
		String expected = 
				"**************************\n" +
				"***** Customer Owes ******\n" +
				"**************************\n" +
				"name:Dario\n" +
				"amount:40.0\n";
		
		refactoring.printOwing(20);
		
		assertEquals(expected,out.toString());
	}
}
